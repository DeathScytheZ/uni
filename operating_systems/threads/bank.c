#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>
#include <stdbool.h>

#define NUM_ACCOUNTS 5
#define NUM_THREADS 10
#define TRANSFERS_PER_THREAD 50000

typedef struct {
    int id;
    int balance;
    pthread_mutex_t lock;
} Account;

Account accounts[NUM_ACCOUNTS];

void transfer_money(int from_id, int to_id, int amount) {
    bool did_transfer = false;
    if (from_id == to_id) return; // Can't transfer to self
    if(&accounts[from_id].lock < &accounts[to_id].lock){
        pthread_mutex_lock(&accounts[from_id].lock);
        pthread_mutex_lock(&accounts[to_id].lock);
    }else{
        pthread_mutex_lock(&accounts[to_id].lock);
        pthread_mutex_lock(&accounts[from_id].lock);
    }
    if(!(accounts[from_id].balance < amount)){
        accounts[to_id].balance += amount;
        accounts[from_id].balance -= amount;
        did_transfer = true;
    }

    pthread_mutex_unlock(&accounts[to_id].lock);
    pthread_mutex_unlock(&accounts[from_id].lock);

    if(did_transfer){
        printf("Transfered %d from account %d to account %d\n", amount ,from_id ,to_id);
    }

}

void* worker(void* arg) {
    for (int i = 0; i < TRANSFERS_PER_THREAD; i++) {
        int from = rand() % NUM_ACCOUNTS;
        int to = rand() % NUM_ACCOUNTS;
        int amount = rand() % 50 + 1;
        transfer_money(from, to, amount);
    }
    return NULL;
}

int main() {
    srand(time(NULL));
    
    // Initialize accounts
    int total_initial = 0;
    for (int i = 0; i < NUM_ACCOUNTS; i++) {
        accounts[i].id = i;
        accounts[i].balance = 1000;
        pthread_mutex_init(&accounts[i].lock, NULL);
        total_initial += accounts[i].balance;
    }
    printf("Initial Total Bank Value: %d\n", total_initial);

    // Start threads
    pthread_t threads[NUM_THREADS];
    for (int i = 0; i < NUM_THREADS; i++) {
        pthread_create(&threads[i], NULL, worker, NULL);
    }

    // Wait for threads
    for (int i = 0; i < NUM_THREADS; i++) {
        pthread_join(threads[i], NULL);
    }

    // Audit
    int total_final = 0;
    for (int i = 0; i < NUM_ACCOUNTS; i++) {
        total_final += accounts[i].balance;
        pthread_mutex_destroy(&accounts[i].lock);
    }
    printf("Final Total Bank Value:   %d\n", total_final);

    if (total_initial == total_final) {
        printf("SUCCESS: Books are balanced!\n");
    } else {
        printf("FAILURE: Money leaked! Race condition detected.\n");
    }
    int something;
    int* ptr = &something;

    printf("%p" , ptr);

    return 0;
}

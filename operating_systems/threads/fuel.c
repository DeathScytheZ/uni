#include <stdio.h>
#include <pthread.h>
#include <unistd.h>
#include <stdbool.h>

pthread_mutex_t mutexFuel;
pthread_cond_t condFuel;
pthread_cond_t condFuel2;
int fuel = 0;

void* fill_fuel(void* arg) {
    for (int i = 0; i < 5; i++) {
        pthread_mutex_lock(&mutexFuel);
        sleep(1); // Simulating time to pump gas
        while(fuel > 0){
            pthread_cond_wait(&condFuel2, &mutexFuel);
        }
        fuel++;
        pthread_mutex_unlock(&mutexFuel);
        pthread_cond_signal(&condFuel);
        printf("Filled fuel\n");
        // TODO:
        // 1. Lock mutex
        // 2. Increment fuelaa
        // 3. Print "Filled fuel..."
        // 4. SIGNAL the waiting thread
        // 5. Unlock mutex
    }
    return NULL;
}

void* car(void* arg) {
    for(int i = 0; i < 5; i++){
        pthread_mutex_lock(&mutexFuel);
        while(!(fuel > 0)){
            pthread_cond_wait(&condFuel, &mutexFuel);
        }
        fuel--;
        pthread_mutex_unlock(&mutexFuel);
        pthread_cond_signal(&condFuel2);
        printf("Car got fuel. Now leaving...\n");
    }
    // TODO:
    // 1. Lock mutex
    // 2. LOOP: While fuel is 0, WAIT on the condition variable
    // 3. Decrement fuel (consume it)
    // 4. Print "Car got fuel. Now leaving..."
    // 5. Unlock mutex
    return NULL;
}

int main() {
    pthread_mutex_init(&mutexFuel, NULL);
    pthread_cond_init(&condFuel, NULL);
    pthread_cond_init(&condFuel2, NULL);
    
    pthread_t t1, t2;
    pthread_create(&t1, NULL, car, NULL);
    pthread_create(&t2, NULL, fill_fuel, NULL);
    
    pthread_join(t1, NULL);
    pthread_join(t2, NULL);
    
    pthread_mutex_destroy(&mutexFuel);
    pthread_cond_destroy(&condFuel);
    pthread_cond_destroy(&condFuel2);
    return 0;
}

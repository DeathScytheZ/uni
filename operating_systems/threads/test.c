#include <stdio.h>
#include <unistd.h>
#include <pthread.h>

int counter = 0;
int counter2 = 0;

pthread_mutex_t lock;
pthread_mutex_t lock2;

void* routine(void* arg){
    for(int i = 0; i < 1000; i++){
        pthread_mutex_lock(&lock);
        counter++;
        pthread_mutex_lock(&lock2);
        pthread_mutex_unlock(&lock);
        pthread_mutex_unlock(&lock2);
    }
    return NULL;
}


void* routine2(void* arg){
    for(int i = 0; i < 1000; i++){
        pthread_mutex_lock(&lock2);
        counter2++;
        pthread_mutex_lock(&lock);
        pthread_mutex_unlock(&lock);
        pthread_mutex_unlock(&lock2);
    }
    return NULL;
}

int main(){
    pthread_t thread1, thread2;
    pthread_mutex_init(&lock, NULL);
    pthread_mutex_init(&lock2, NULL);
    pthread_create(&thread1,NULL, routine,NULL);
    pthread_create(&thread2,NULL, routine,NULL);
    pthread_join(thread1, NULL);
    pthread_join(thread2, NULL);
    pthread_mutex_destroy(&lock);
    printf("Counter: %d\n", counter);
    return 0;
}

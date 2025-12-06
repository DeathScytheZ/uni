#include <stdio.h>
#include <pthread.h>
#include <stdlib.h>
#include <time.h>

void* my_turn(void* arg){
    int num = * (int*)arg;
    if (num < 10) {
        printf("New thread executing!\n");
        pthread_exit(NULL);
    }else{
        printf("the random number is: %d\n", num);
        pthread_exit(NULL);
    }
    pthread_exit(NULL);
}

int main(){
    srand(time(NULL));
    int num = rand() % 20;
    pthread_t thread;
    pthread_create(&thread, NULL, my_turn, &num);
    pthread_join(thread, NULL);
    printf("Main thread finished!");
}

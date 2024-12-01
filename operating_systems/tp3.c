#include <stdio.h>
#include <pthread.h>
#include <math.h>

pthread_t thread1, thread2, thread3;
int x = 3;
int y = 5;
int sumX, sumY, result;
void* firstSum(){
    for(int i = 1; i <= 3; i++){
        sumX += pow(x, i);
    }
    pthread_exit(NULL);
}

void* secondSum(){
    for(int i = 1; i <= 3; i++){
        sumY += pow(y, i);
    }
    pthread_exit(NULL);
}

void* totalSum(){
    pthread_join(thread1, NULL);
    pthread_join(thread2, NULL);
    result = sumX + sumY;
    pthread_exit(NULL);
}

int main(){
    pthread_create(&thread1, NULL, firstSum, NULL);
    pthread_create(&thread2, NULL, secondSum, NULL);
    pthread_create(&thread3, NULL, totalSum, NULL);
    pthread_join(thread3, NULL);
    printf("The result is: %d \n", result);
}


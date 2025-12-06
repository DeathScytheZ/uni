#include <stdio.h>
#include <pthread.h>
#include <stdlib.h>

#define N 10
#define M 10

int matrix1[N][M], matrix2[N][M], matrix3[N][M]; 

void* routine(void* arg){
    int n = *(int*) arg;
    int* result = malloc( M * sizeof(int));
    for(int i = 0; i < M; i++){
        result[i] = matrix1[n][i] + matrix2[n][i]; 
    }
    pthread_exit(result);
} 

int main(){
    pthread_t threads[N]; 
    for(int i = 0; i < N; i++){
        pthread_create(&threads[i], NULL, routine, (void*) &threads[i]);
    }
    for(int i = 0; i < N; i++){
        pthread_join(threads[i], NULL); 
    }
}

#include <stdio.h>
#include <pthread.h>
#include <stdlib.h>
#include <time.h>

#define N 10
#define M 10

int matrix1[N][M], matrix2[N][M], matrix3[N][M]; 

void* routine(void* arg){
    int n = *(int*) arg;
    for(int i = 0; i < M; i++){
        matrix3[n][i] = matrix1[n][i] + matrix2[n][i]; 
    }
    pthread_exit(NULL);
} 

int main(){
    pthread_t threads[N];
    int ids[N];
    srand(time(NULL));
    for(int i = 0; i < N; i++){
        ids[i] = i;
        for(int j = 0; j < M; j++){
            matrix1[i][j] = rand() % 100 + 1;
            matrix2[i][j] = rand() % 100 + 1;
        }
    }
    for(int i = 0; i < N; i++){
        for(int j = 0; j < M; j++){
            printf("%d ", matrix1[i][j]);
        }
        printf("\n");
    }

    printf("\n");

    for(int i = 0; i < N; i++){
        for(int j = 0; j < M; j++){
            printf("%d ", matrix2[i][j]);
        }
        printf("\n");
    }

    printf("\n");

    for(int i = 0; i < N; i++){
        pthread_create(&threads[i], NULL, routine, (void*) &ids[i]);
    }
    for(int i = 0; i < N; i++){
        pthread_join(threads[i], NULL);
    }

    for(int i = 0; i < N; i++){
        for(int j = 0; j < M; j++){
            printf("%d ", matrix3[i][j]);
        }
        printf("\n");
    }
}

#include <stdio.h>
#include <pthread.h>
#include <stdlib.h>

#define N 10
#define M 10

typedef struct {
	int result[M];
	int n;
} ROW;

int matrix1[N][M], matrix2[N][M], matrix3[N][M]; 

void* routine(void* arg){
    ROW row = *(ROW*) arg;
    for(int i = 0; i < M; i++){
        row.result[i] = matrix1[row.n][i] + matrix2[row.n][i]; 
    }
    pthread_exit(NULL);
} 

int main(){
    srand(time(NULL));
    for(int i = 0; i < N; i++){
	for(int j = 0; j < M; j++){
	    matrix1[i][j] = rand() % 100 + 1;
	    matrix2[i][j] = rand() % 100 + 1;
	}
    }
    pthread_t threads[N];
    ROW rows[N];
	
    for(int i = 0; i < N; i++){
	rows[i].n = i;
        pthread_create(&threads[i], NULL, routine, (void*) &rows[i]);
    }
    for(int i = 0; i < N; i++){
        pthread_join(threads[i], NULL); 
	for(int j = 0; j < M; j++){
		matrix3[i][j] = rows[i].result[j];
	}
}
}

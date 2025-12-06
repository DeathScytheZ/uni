#include <stdio.h>
#include <stdlib.h>

#define N 10000
#define M 10000

int matrix1[N][M], matrix2[N][M], matrix3[N][M]; 

int main(){
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            matrix1[i][j] = rand() % 100 + 1;
            matrix2[i][j] = rand() % 100 + 1;
            matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
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
        for(int j = 0; j < M; j++){
            printf("%d ", matrix3[i][j]);
        }
        printf("\n");
    }
}

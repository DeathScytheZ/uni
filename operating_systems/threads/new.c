#include <pthread.h>
#include <stdio.h>
#include <unistd.h>

pthread_t t1, t2, t3;

void* ma_function1(void* arg){
    printf("\n CENTRE \n");
    pthread_exit(NULL);
}

void* ma_function2(void* arg){
    printf("\n UNIVERSITAIRE \n");
    pthread_exit(NULL);
}

void* ma_function3(void* arg){
    printf("\n MILA \n");
    pthread_exit(NULL);
}

int main(int argc, char* argv[]){
    pthread_create(&t1, NULL, &ma_function1, NULL);
    pthread_join(t1, NULL);
    pthread_create(&t2, NULL, &ma_function2, NULL);
    pthread_join(t2, NULL);
    pthread_create(&t3, NULL, &ma_function3, NULL);
    pthread_join(t3, NULL);
    return 0;
}

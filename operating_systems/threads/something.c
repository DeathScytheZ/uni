#include <stdio.h>
#include <pthread.h>

void* thread_function1(void* arg){
    printf("This is thread 1");
    pthread_exit(NULL);
}

void* thread_function2(void* arg){
    printf("This is thread 2");
    pthread_exit(NULL);
}

void* thread_function3(void* arg){
    printf("This is thread 3");
    pthread_exit(NULL);
}

void* thread_function4(void* arg){
    printf("This is thread 4");
    pthread_exit(NULL);
}

void* thread_function5(void* arg){
    printf("This is thread 5");
    pthread_exit(NULL);
}

void* thread_function6(void* arg){
    printf("This is thread 6");
    pthread_exit(NULL);
}

int main(){
    pthread_t t1, t2, t3, t4, t5, t6;
    pthread_create(&t1, NULL, &thread_function1, NULL);
    pthread_create(&t2, NULL, &thread_function2, NULL);
    pthread_create(&t3, NULL, &thread_function3, NULL);
    pthread_create(&t4, NULL, &thread_function4, NULL);
    pthread_create(&t5, NULL, &thread_function5, NULL);
    pthread_create(&t6, NULL, &thread_function6, NULL);
}

#include <pthread.h>
#include <stdio.h>

void* T1(){
	printf("centre ");
}

void* T2(){
	printf("universitaire ");
}
void* T3(){
	printf("Mila ");
}

void main(){
	pthread_t thread1, thread2, thread3;
	pthread_create(&thread1, NULL, *T1, NULL);
	pthread_create(&thread2, NULL, *T2, NULL);
	pthread_create(&thread3, NULL, *T3, NULL);
	pthread_join(thread1, NULL);
	pthread_join(thread2, NULL);
	pthread_join(thread3, NULL);
	printf("main_thread");
}

#include <stdio.h>
#include <pthread.h>
#include <stdlib.h>


int main(){
    int* ptr = malloc(4 * sizeof(int));    
    ptr[1] = 3;
    *(2 + ptr) = 4;
    printf("%d\n", ptr[1]);
    printf("%d", ptr[2]);
}

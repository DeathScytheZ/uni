#include <stdio.h>

void main(){
	int n;
	printf("Enter a number: ");
	scanf("%d", &n);
	for(int i = 0; i < n; i++){
		for(int j = 0; j < 2 * (n - i) - 2; j++){
			printf(" ");
		}
		for(int k = 0; k <= i; k++){
			printf("* ");
		}
		printf("\n");
	}
}

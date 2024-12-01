%{
	#include <stdio.h>
	#include <stdbool.h>
	bool iscomment = false;
%}


%%
\/\*[\s\S]*?\*\/	{printf("%s", "This is a comment (:");}
.					{printf("%s", "This is not a comment ):");}

%%


int main(){
	yylex();
}

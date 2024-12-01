%{
	#include <stdio.h>
	int vow = 0;
	int cons = 0;
	int punc = 0;
%}


%%
[aeiouAEIOU]	{vow++;}
	
[a-zA-Z]		{cons++;}	

[?.!:,]			{punc++;}

[\n] 			{return 0;}

. 				{}

%%

void main(){
	yylex();
	printf("vowels: %d\nconsonants: %d\npunctuation: %d\n", vow, cons, punc);
}

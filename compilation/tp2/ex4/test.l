%{
	#include <stdio.h>
	#include <ctype.h>
%}

%%
[A-Z]   {char c = yytext[0];
		 char ch = tolower(c);
		 fprintf(yyout,"%c" , ch);
		}

[ \t]+$ {}
%%

int main(){
	yyin = fopen("test.in", "r");
	yyout = fopen("test.out", "w");
	yylex();
	fclose(yyin);
	fclose(yyout);
}

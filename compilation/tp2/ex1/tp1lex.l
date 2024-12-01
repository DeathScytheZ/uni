%{
	int chars = 0;
	int words = 0;
	int lines = 0;
%}

%%
[a-zA-Z]+	{words++; chars += yyleng;}
\n 			{chars++; lines++;}
. 			{chars++;}

%%
int main(int argc, char **argv){
	yyin = fopen("lex.yy.c",  "r");
	yylex(); 
	printf("lines=%d\n words=%d\n chars=%d", lines, words, chars);
	fclose(yyin);
}



%%
[0-9]+ {int i = atoi(yytext);
		if(i % 7 == 0) fprintf(yyout, "%d", i + 3);
		else fprintf(yyout, "%d", i);}
%%

int main(){
	yyin = fopen("scan.in", "r");
	yyout = fopen("scan.out", "w");
	yylex();
	fclose(yyin);
	fclose(yyout);
}

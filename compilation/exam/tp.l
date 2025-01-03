%%
[0-9]+ {
        int value = atoi(yytext);
        if(value % 7 == 0){
            value += 3;
        }
        fprintf(yyout, "%d", value);
    }
%%


int main(){
    yyin = fopen("test.in", "r"); 
    yyout= fopen("test.out", "w"); 
    yylex();
    fclose(yyin);
    fclose(yyout);
}

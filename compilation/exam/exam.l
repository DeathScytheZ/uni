%{
int chars = 0;
int words = 0;
int lines = 0;
%}


%%
[a-zA-Z]+    { words++; chars += yyleng; }
\n           { chars ++; lines++; } 
.            { chars++; }

%%


int main(){
    yyin = fopen("test.txt", "r"); 
    yylex(); 
    printf("Number of characters: %d\nNumber of words: %d\nNumber of lines: %d", chars, words, lines);
    fclose(yyin);
}

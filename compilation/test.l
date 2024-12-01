%{
#include <stdio.h>

int line_number = 1;
%}

%%
\n                  { line_number++; }

(int|float|unsigned[ \t]+int|char|unsigned[ \t]+char)[ \t]+[a-zA-Z_][a-zA-Z0-9_]* {
                       printf("\nIdentifier: %s on line %d\n", yytext, line_number);
                   }

.                   ;
%%

int main() {
    yylex();  
    return 0;
}






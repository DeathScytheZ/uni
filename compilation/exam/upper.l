%{
#include <ctype.h>

%}



%%
[A-Z]   {printf("%c",tolower(yytext[0]));}
[\t ]+  {}
.       {printf(yytext);}

%%



int main(){
    yylex();


}

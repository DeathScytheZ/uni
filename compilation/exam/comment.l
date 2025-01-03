%{

%}



%%
\/\/.*                    {}
\/\*([^*]|[^*/])*\*\/  {}
.                   {printf(yytext);}
%%



int main(){
    yylex();        
    return 0;
}

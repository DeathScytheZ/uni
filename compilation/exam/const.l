%{
    int vowels = 0;
    int consonants = 0;
    int ponctuation = 0;
%}



%%
[ieaouyIEAOUY]  {vowels++;}
[a-zA-Z]        {consonants++;}
[!?.,:]         {ponctuation++;}
.               {}
%%

int main(){
    yylex();
    printf("Vowels: %d\nConsonants: %d\nPonctuation: %d", vowels, consonants, ponctuation);
    return 0;
}

%{
	int nb;
%}
pairpair (aa|bb)*((ab|ba)(aa|bb)*(ab|ba)(aa|bb)*)*
%%
a*b*		{printf("[%s] : des a d'abord et des b ensuite\n",yytext);}
{pairpair}	{printf("[%s] : nb pair de a et de b\n", yytext);}
[\n]		
.			{nb++; printf("(ignore %c)\n", yytext[0]);}

%%
void main(){
	nb = 0;
	yylex();
	printf("\n%d caracters ignores\n", nb);
}


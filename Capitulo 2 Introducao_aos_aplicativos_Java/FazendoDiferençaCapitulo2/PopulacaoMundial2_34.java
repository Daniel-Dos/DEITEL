package FazendoDiferen�aCapitulo2;

//2.34 escreva um aplicativo que introduza esses valores , e entao 
//exiba a popula�ao mundial estimada depos de um ano, doi, tres ,quatro e 5 anos.

public class PopulacaoMundial2_34 {
	
	public static void main ( String [] args )
	{
		double populacaoAtual = 7201904500.0 ,//poula��o atual
				crescimentoAnual = 1.17 / 100 ; //taxa de crescimento anual.
		
		System.out.printf( "Para 2014 haver�o %,.0f habitantes no planeta !\n", (populacaoAtual * ( 1.0 + crescimentoAnual ) ) );
		populacaoAtual = populacaoAtual * ( 1.0 + crescimentoAnual);
		
		System.out.printf( "Para 2015 haver�o %,.0f habitantes no planeta !\n", (populacaoAtual * ( 1.0 + crescimentoAnual ) ) );
		populacaoAtual = populacaoAtual * ( 1.0 + crescimentoAnual);
		
		System.out.printf( "Para 2016 haver�o %,.0f habitantes no planeta !\n", (populacaoAtual * ( 1.0 + crescimentoAnual ) ) );
		populacaoAtual = populacaoAtual * ( 1.0 + crescimentoAnual);
		
		System.out.printf( "Para 2017 haver�o %,.0f habitantes no planeta !\n", (populacaoAtual * ( 1.0 + crescimentoAnual ) ) );
		populacaoAtual = populacaoAtual * ( 1.0 + crescimentoAnual);
		
		System.out.printf( "Para 2018 haver�o %,.0f habitantes no planeta !\n", (populacaoAtual * ( 1.0 + crescimentoAnual ) ) );
		populacaoAtual = populacaoAtual * ( 1.0 + crescimentoAnual);
		

		System.out.printf( "Para 2019 haver�o %,.0f habitantes no planeta !\n", (populacaoAtual * ( 1.0 + crescimentoAnual ) ) );
		populacaoAtual = populacaoAtual * ( 1.0 + crescimentoAnual);
		
	}

}

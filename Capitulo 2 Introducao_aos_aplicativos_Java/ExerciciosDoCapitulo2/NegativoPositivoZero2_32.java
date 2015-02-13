package ExerciciosDoCapitulo2;

import java.util.Scanner;

//2.31 escreva um aplicativo que insere 5 numeros e 
//determina e imprima quantos números positivo, negativo e zeros foram inserios.
//exercio fora de questao para o capitulo 2

public class NegativoPositivoZero2_32 
{
	public static void main ( String [] args )
	{
		Scanner input = new Scanner( System .in ) ;
		int numero , pos = 0 , neg  = 0, zero = 0 ; 
		
		System.out.print( "Entre com o Primeiro numero :" );
		numero = input.nextInt() ;
		
		if( numero > 0   )
			pos++ ;
		
		if( numero < 0 )
			neg++ ;
		
		if ( numero == 0 )
			zero++ ;
		
		System.out.print( "Entre com o segundo  numero :" );
		numero = input.nextInt() ;
		
		if( numero > 0   )
			pos++ ;
		
		if( numero < 0 )
			neg++ ;
		
		if ( numero == 0 )
			zero++ ;
		
		System.out.print( "Entre com o terceiro numero :" );
		numero = input.nextInt() ;
		
		if( numero > 0   )
			pos++ ;
		
		if( numero < 0 )
			neg++ ;
		
		if ( numero == 0 )
			zero++ ;
		
		System.out.print( "Entre com o quarto numero :" );
		numero = input.nextInt() ;
		
		if( numero > 0   )
			pos++ ;
		
		if( numero < 0 )
			neg++ ;
		
		if ( numero == 0 )
			zero++ ;
		
		System.out.print( "Entre com o quinto  numero :" );
		numero = input.nextInt() ;
		
		if( numero > 0   )
			pos++ ;
		
		if( numero < 0 )
			neg++ ;
		
		if ( numero == 0 )
			zero++ ;
		
		System.out.printf( "Positivo:%d\n Negativo:%d\n Zeros:%d " , pos , neg , zero );
	}

}

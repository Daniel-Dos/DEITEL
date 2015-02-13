package ExerciciosDoCapitulo2;

import java.util.Scanner;

//2.30 separando os digitos em um inteiro 

public class SepararDigitosDeInteiro2_30 
{
	public static void main ( String [] args )
	{
		Scanner input = new Scanner( System.in );
		
		int numero ; 
		System.out.print( "Inserir numero com 5 algarismos:" );
		numero = input.nextInt();
		
		System.out.printf( "%d %s", ( numero / 10000 ) % 10 , " " );
		System.out.printf( "%d %s" , (numero / 1000 ) % 10 , " " );
		System.out.printf( "%d %s " , (numero / 100) % 10 , " " );
		System.out.printf( "%d %s", ( numero / 10 ) % 10 , " " );
		System.out.printf( "%d %s" ,  (numero / 1 ) % 10 , " ");
		
		
	}

}

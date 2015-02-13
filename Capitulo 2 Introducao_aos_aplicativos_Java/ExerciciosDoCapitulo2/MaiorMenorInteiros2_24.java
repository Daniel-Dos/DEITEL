package ExerciciosDoCapitulo2;

//2.24 le cinco inteiros , determinar e imprimir o maior e o menor inteiro do grupo.

import java.util.Scanner;

public class MaiorMenorInteiros2_24 
{
	public static void main ( String [] args )
	{
		Scanner input = new Scanner( System.in );
		
		int maior , 
		    menor ,
		    number1 , 
		    number2 , 
		    number3 , 
		    number4 , 
		    number5 ;
		
		System.out.print( "Enter First Number:" );
		number1 = input.nextInt();
		
		System.out.print( "Enter Second Number:" );
		number2 = input.nextInt();
		
		System.out.print( "Enter Thrid Number:" );
		number3 = input.nextInt();
		
		System.out.print( "Enter Fourd Number:" );
		number4 = input.nextInt();
		
		System.out.print( "Enter Five Number:" );
		number5 = input.nextInt();
		
		maior = number1 ;
		menor = number1 ;
		
		//condiçao maior
		if( number2 > maior )
			maior = number2 ;
		
		if( number3 > maior )
			maior = number3 ;
		
		if( number4 > maior )
			maior = number4 ;
		
		if( number5 > maior )
			maior = number5 ;
		
		//condiçao menor
		if( number2 < menor )
			menor = number2 ;
		
		if( number3 < menor )
			menor = number3 ;
		
		if( number4 < menor )
			menor = number4 ;
		
		if( number5 < menor )
			menor = number5 ;
		
		//exibindo o maior e o menor.
		System.out.printf( "O maior é : %d e o menor é : %d" , maior , menor );
		
	}

}

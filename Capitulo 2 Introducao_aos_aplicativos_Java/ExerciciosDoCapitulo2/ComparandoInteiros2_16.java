package ExerciciosDoCapitulo2;

import java.util.Scanner;

//2.16 - Comparando inteiros  
// se o numero for maior exiber is larger mas o numero
//se igual exibir these number are equal.

public class ComparandoInteiros2_16 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		
		int number1 , // primeiro numero a comparar
		    number2 ; // segundo numero a comparar.
		
		//Entrada de dados do usuario.
		System.out.print( "Enter first Number: " );
		number1 = input.nextInt();
		
		System.out.print( "Enter Second Number: " );
		number2 = input.nextInt();
		
		//comparando
		
				if(number1 > number2 )
					System.out.printf( "%d is Larger\n" , number1 ); //exibe o number1 se for maior
				
				if(number2 > number1)
					System.out.printf( "%d is Larger\n" , number2 ); //exiber o number2 se for maior
				
				if(number1 == number2)
					System.out.printf( "These number are equal " );
	
	}

}

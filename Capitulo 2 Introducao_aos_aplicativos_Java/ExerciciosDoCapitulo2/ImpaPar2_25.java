package ExerciciosDoCapitulo2;

//2.25 le um inteiro e determinar se � par ou impar.

import java.util.Scanner;

public class ImpaPar2_25 
{
	public static void main( String [] args )
	{
		Scanner input = new Scanner( System.in );
		
		int number ;
		
		System.out.print("Insira um numero: ");
		number = input.nextInt();
		
		if(number % 2 == 0 ) // divide o numero por 2 � se o resto for 0 o numero � par.
			System.out.println("� Par");
		
		if( number % 2 !=0 )//divide o numero por 2 � se o resto for diferente de 0 � impar.
			System.out.println("� Impar");
	}

}

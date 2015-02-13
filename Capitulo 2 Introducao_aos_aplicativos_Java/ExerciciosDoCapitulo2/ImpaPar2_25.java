package ExerciciosDoCapitulo2;

//2.25 le um inteiro e determinar se é par ou impar.

import java.util.Scanner;

public class ImpaPar2_25 
{
	public static void main( String [] args )
	{
		Scanner input = new Scanner( System.in );
		
		int number ;
		
		System.out.print("Insira um numero: ");
		number = input.nextInt();
		
		if(number % 2 == 0 ) // divide o numero por 2 é se o resto for 0 o numero é par.
			System.out.println("é Par");
		
		if( number % 2 !=0 )//divide o numero por 2 é se o resto for diferente de 0 é impar.
			System.out.println("é Impar");
	}

}

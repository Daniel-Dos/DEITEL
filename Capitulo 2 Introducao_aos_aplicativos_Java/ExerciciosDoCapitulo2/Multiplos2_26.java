package ExerciciosDoCapitulo2;

//2.26 - le dois numeros e determinar se o primeiro e�multiplo do segundo.

import java.util.Scanner;

public class Multiplos2_26 
{

	public static void main ( String [] args )
	{
		Scanner input = new Scanner ( System.in );
		int num1,
		    num2;
		
		System.out.print( "Enter First Number:" );
		num1 = input.nextInt();
		
		System.out.print( "Enter Second Number:" );
		num2 = input.nextInt();
		
		if(num1 % num2 == 0)// divide o nun1 pelo num2 � se o resto for 0 o numero � multiplo
			System.out.printf("%d � Multiplo de %d" , num1 , num2);
		
		if(num1 % num2 !=0) //divide o nun1 pelo num2 � se o resto for diferente de 0 o numero n�o � multiplo
			System.out.printf("%d n�o � Multiplo de %d" , num1 , num2);
		
		
		
		
	}
}

package ExerciciosDoCapitulo2;

//2.17 - inserir 3 inteiros
//exibir a soma,media , produto maior e menor.

import java.util.Scanner;


public class AritmeticaMaiorMenor2_17
{
	public static void main( String [] args )
	{
		Scanner input = new Scanner( System.in );
		
		int number1,
		    number2,
		    number3,
		    soma,
		    media,
		    produto;
		
		//entrada de dados
		System.out.print( "Enter First Number: " );
		number1 = input.nextInt() ;//le o primeiro numero
		
		System.out.print( "Enter Secont Number: " );
		number2 = input.nextInt(); //le o segundo numero
		
		System.out.print( "Enter Thrid Number: " );
		number3 = input.nextInt(); //le o terceiro numero
		
		//calculando soma,media produto
		
		soma = number1 + number2 + number3 ; //soma os tres valores inserido pelo usuario.
		produto = number1 * number2 * number3; //multiplica os tres valores inserido pelo usuario.
		media = soma / 3 ; // calcula a media da soma e divide por 3 , pois o usuario inseriu tres valores.
		
		//exibindo os valores de soma , media e produto.
		
		System.out.println( "exibindo os valores de soma , media e produto." );
		
		System.out.printf( "Sum is :%d\n" , soma ); // exibe a soma dos numeros
		System.out.printf( "Media is :%d\n" , media ); //exibe a media dos numeros
		System.out.printf( "Product is:%d\n" , produto); // exibe a multiplicaçao dos numeros.
		
		//comparaçao entre inteiros  menor.
		
		System.out.println( "comparaçao entre inteiros  menor" );
		
		if( number1 < number2)
			System.out.printf( "%d < %d\n" , number1 , number2 ); //exibe o numero menor entre number 1 e number2
		
		if( number1 < number3)
			System.out.printf( "%d < %d\n" , number1 , number3 ); //exibe o numero menor entre number 1 e number3
		
		if( number2 < number1)
			System.out.printf( "%d < %d\n" , number2 , number1 ); //exibe o numero menor entre number 2 e number1
		
		if( number2 < number3)
			System.out.printf( "%d < %d\n" , number2 , number3 ); //exibe o numero menor entre number 2 e number3
		
		if( number3 < number1)
			System.out.printf( "%d < %d\n" , number3 , number1 ); //exibe o numero menor entre number 3 e number1
			
		if( number3 < number2)
			System.out.printf( "%d < %d\n" , number3 , number2 ); //exibe o numero menor entre number3 e number2
		
		//comparaçao entre inteiros  maior
		
		System.out.println( "comparaçao entre inteiros  maior" );
		
		if( number1 > number2)
			System.out.printf( "%d > %d\n" , number1 , number2 ); //exibe o numero maior entre number1 e number2
		
		if( number1 > number3)
			System.out.printf( "%d > %d\n" , number1 , number3 ); //exibe o numero maior entre number1 e number3
		
		if( number2 > number1)
			System.out.printf( "%d > %d\n" , number2 , number1 ); //exibe o numero maior entre number2 e number1
		
		if( number1 > number3)
			System.out.printf( "%d > %d\n" , number2 , number3 ); //exibe o numero maior entre number2 e number3
		
		if( number3 > number1)
			System.out.printf( "%d > %d\n" , number3 , number1 ); //exibe o numero maior entre number3 e number1
		
		if( number3 > number2)
			System.out.printf( "%d > %d\n" , number3 , number2 ); //exibe o numero maior entre number3 e number2
	}

}

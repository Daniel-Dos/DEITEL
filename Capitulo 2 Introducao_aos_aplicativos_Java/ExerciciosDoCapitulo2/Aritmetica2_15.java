package ExerciciosDoCapitulo2;

import java.util.Scanner;

//ecercicio 2.15 do capitulo 2 do livro :
//Java Como Programar 8� Edi��o.

//inserir dois numeros inteiros 
//imprimir soma, diferen�a ,produto e quociente

public class Aritmetica2_15 
{
	public static void main( String [] args )
	{
		//cria um objeto Scannner 
		Scanner input = new Scanner(System.in);
		
		//variaveis:
		int numero1 , // primeiro numero a adicionar
		    numero2 ,// segundo numero a adiconar
		    soma , // soma os numeros recebidos
		    diferen�a , //subtrai os numeros recebidos
		    produto , // multiplica os numeros recebidos
		    quociente ; //divide os numeros recebidos.
		
		//entrada e saida do prompt
		System.out.print( " Enter First Number : " ); //prompt
		numero1 = input.nextInt(); // le o primeiro numero fornecido pelo usuario.
		
		System.out.print( "Enter Second Number : " ); //prompt
		numero2 = input.nextInt(); // le o segundo numero fornecido pelo usuario.
		
		//atribuidos os valores para as variaveis soma , produto , diferen�a e quociente.
		soma = numero1 + numero2 ; // soma os numeros recebido pelo usuario e adiciona a variavel soma.
		
		diferen�a = numero1 - numero2 ; // subtrair os numeros recebido pelo usuario e adiciona a variavel diferen�a
		
		produto = numero1 * numero2 ; // multiplica os numeros recebido pelo usuario e adiciona a variavel produto.
		
		quociente = numero1 / numero2 ; // divide os numeros recebido pelo usuario e adiciona a variavel produto.
		
		//exibindo os valores das opera�oes.
		
		System.out.printf( "Sum is : %d\n" , soma); //exibe a soma.
		System.out.printf( "Diference is : %d\n" , diferen�a ); //exibe a diferen�a
		System.out.printf( "Product is : %d\n" , produto ); // exibe o produto
		System.out.printf( "Quocient is : %d\n" , quociente ); // exibe o quociente.
		
	}//fim do metodo main

} // fim da classe Aritmetica

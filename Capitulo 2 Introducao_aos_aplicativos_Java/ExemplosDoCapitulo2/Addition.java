package ExemplosDoCapitulo2;

import java.util.Scanner;//programa utiliza a classe Scanner

//Figura 2.7: Additon.java
//Programa de adição que exibe a soma de dois numeros.

public class Addition {
	// metodo principal inicia a execuçao do aplicativo java
	public static void main(String[] args) {
		// cria um Scanner para obter entrada da janela de comando.
		Scanner input = new Scanner(System.in);

		int number1; // primeiro número a adicionar
		int number2; // segundo número a adicionar
		int sum; // soma de number1 e number2

		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt(); // lê o primeiro número fornecido pelo
									// usuario.

		System.out.print("Enter second integer: "); // prompt
		number2 = input.nextInt(); // lê o segundo número fornecido pelo
									// usuario.

		sum = number1 + number2; // soma os números, depois armazena o total em
									// sum.

		System.out.printf("Sum is %d\n", sum); // exibe a soma.
		
		
	}// fim do metodo main

}// fim da classe Addition

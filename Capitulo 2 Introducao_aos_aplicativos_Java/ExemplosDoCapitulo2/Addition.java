package ExemplosDoCapitulo2;

import java.util.Scanner;//programa utiliza a classe Scanner

//Figura 2.7: Additon.java
//Programa de adi��o que exibe a soma de dois numeros.

public class Addition {
	// metodo principal inicia a execu�ao do aplicativo java
	public static void main(String[] args) {
		// cria um Scanner para obter entrada da janela de comando.
		Scanner input = new Scanner(System.in);

		int number1; // primeiro n�mero a adicionar
		int number2; // segundo n�mero a adicionar
		int sum; // soma de number1 e number2

		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt(); // l� o primeiro n�mero fornecido pelo
									// usuario.

		System.out.print("Enter second integer: "); // prompt
		number2 = input.nextInt(); // l� o segundo n�mero fornecido pelo
									// usuario.

		sum = number1 + number2; // soma os n�meros, depois armazena o total em
									// sum.

		System.out.printf("Sum is %d\n", sum); // exibe a soma.
		
		
	}// fim do metodo main

}// fim da classe Addition

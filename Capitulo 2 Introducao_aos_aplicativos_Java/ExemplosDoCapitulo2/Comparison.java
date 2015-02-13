package ExemplosDoCapitulo2;

//figura 2.15: Comparison.java
//Compara inteiros utilizando instruções if, operadores
//relacionais e operadores de igualdade.

import java.util.Scanner; //Programa utiliza a classe Scanner.

public class Comparison {
	// metodo principal inicia a execução do aplicativo java.
	public static void main(String[] args) {
		// cria Scanner para obter entrada da janela de comando.
		Scanner input = new Scanner(System.in);

		int number1, // primeiro número a comparar.
		number2; // segundo número a comparar.

		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt(); // lê o primeiro número fornecido pelo
									// usuario.

		System.out.print("Ente second integer: "); // prompt
		number2 = input.nextInt(); // lê o segundo número fornecido pelo
									// usuario.

		if (number1 == number2) // verifica se é igual.
			System.out.printf("%d == %d\n", number1, number2);

		if (number1 != number2) // verifica se é diferente.
			System.out.printf("%d != %d\n", number1, number2);

		if (number1 < number2) // verifica se é menor.
			System.out.printf("%d < %d\n", number1, number2);

		if (number1 > number2) // verifica se é maior.
			System.out.printf("%d > %d\n", number1, number2);

		if (number1 <= number2) // verifica se é menor igual.
			System.out.printf("%d <= %d\n", number1, number2);

		if (number1 >= number2) // verifica se é maior igual.
			System.out.printf("%d >= %d\n", number1, number2);
	}// fim do metodo main

}// fim da classe Comparison

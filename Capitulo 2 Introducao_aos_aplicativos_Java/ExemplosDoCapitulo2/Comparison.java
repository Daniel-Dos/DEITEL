package ExemplosDoCapitulo2;

//figura 2.15: Comparison.java
//Compara inteiros utilizando instru��es if, operadores
//relacionais e operadores de igualdade.

import java.util.Scanner; //Programa utiliza a classe Scanner.

public class Comparison {
	// metodo principal inicia a execu��o do aplicativo java.
	public static void main(String[] args) {
		// cria Scanner para obter entrada da janela de comando.
		Scanner input = new Scanner(System.in);

		int number1, // primeiro n�mero a comparar.
		number2; // segundo n�mero a comparar.

		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt(); // l� o primeiro n�mero fornecido pelo
									// usuario.

		System.out.print("Ente second integer: "); // prompt
		number2 = input.nextInt(); // l� o segundo n�mero fornecido pelo
									// usuario.

		if (number1 == number2) // verifica se � igual.
			System.out.printf("%d == %d\n", number1, number2);

		if (number1 != number2) // verifica se � diferente.
			System.out.printf("%d != %d\n", number1, number2);

		if (number1 < number2) // verifica se � menor.
			System.out.printf("%d < %d\n", number1, number2);

		if (number1 > number2) // verifica se � maior.
			System.out.printf("%d > %d\n", number1, number2);

		if (number1 <= number2) // verifica se � menor igual.
			System.out.printf("%d <= %d\n", number1, number2);

		if (number1 >= number2) // verifica se � maior igual.
			System.out.printf("%d >= %d\n", number1, number2);
	}// fim do metodo main

}// fim da classe Comparison

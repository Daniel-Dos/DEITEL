package ExemplosDoCapitulo2;

import java.util.Scanner;

//exercicio 2.6 pagina 50
//calcular o produto de tres inteiros

public class Product {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // cria um objeto Scanner

		int x, // primeiro numero
		y, // segundo numero
		z, // terceiro numero.
		result; // resultado do produto

		System.out.print(" Enter first Number: ");
		x = input.nextInt(); // le o primeiro numero.

		System.out.print(" Enter second Number: ");
		y = input.nextInt(); // le o segundo numero

		System.out.print(" Enter third Number: ");
		z = input.nextInt(); // le o terceiro numero.

		// calcular o produto dos tres numeros.
		result = x * y * z;

		System.out.printf("Produt is %d\n", result); // exibe o resultado na
														// tela.

	}// fim do metodo main

}// fim da classe Produt.

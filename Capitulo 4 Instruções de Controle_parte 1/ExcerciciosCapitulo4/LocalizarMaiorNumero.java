package ExcerciciosCapitulo4;

/**
 * 4.21 - (Localizar o maior numero) - O processo de localizar o maior valor é muito
 *  utilizado em aplicativo de computador. Por exemplo, um programa que determina
 *  o vencedor de uma competição de vendas inseriria o numero de unidades vendidas
 *  por cada vendedor. O vendedor que vender mias unidades ganha a competiçao.
 *  Escreva um programa em pseudocodigo, e entao , um aplicativo java que aceita
 *  como entrada um serie de 10 inteiros e determinar e imprime o maior do inteiros.
 *  Seu programa deve utilizar pelo menos tres variaveis a seguir :
 *  
 *  - counter: um contador para contar ate 10 (isto é quantos numeros foram inseridos
 *  e determinar todos os 10 numeros foram processados.).
 *  
 *  -number : o inteiro recetemente inserido pelo usuario
 *  
 *  - largest: o maior numero encontrado pelo ususario.
 * 
 * */

import java.util.Scanner;

public class LocalizarMaiorNumero {
	public static void main(String[] args) {

		// criando um objeto Scanner
		Scanner input = new Scanner(System.in);

		// criando as variaveis
		int counter = 0; // contador para conta ate 10
		int number, largest; 

		System.out.println("Digite um Numero:");
		number = input.nextInt();
		largest = number;
		counter++;// pos- incrementa em + 1

		// usando o while para repetição.
		while (counter <= 9) {

			System.out.println("Digite um Numero:");
			number = input.nextInt();

			// utilizando o if para decisão para verificar o maior numero.
			if (number > largest) {
				largest = number;
				counter++;

			}// fim do if

		}// fim do while
		System.out.printf("Maior Numero:%d", largest);
		

	}// fim do main

}// fim da class

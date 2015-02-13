package ExcerciciosCapitulo4;

/**
 * 4.23 - Encontre os dois maiores Numeros - usando uma abordagem semelhante aquela do 4.21,
 * encontre os dois maiores valores entre os 10 valores inserido.(Nota: voce so pode inserir cada numero uma vez. )
 * 
 * */

import java.util.Scanner;

public class LocalizarDoisMaiores {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // obejto Scanner
		
		int maior = 0, segundoMaior = 0, contador = 0, numero; // declarando e inicializando as variaveis 
		

	    while (contador <= 9) {  // laço de repetição 
	     System.out.println("Digite um valor de 0 a 9");  
	      numero = input.nextInt();
	  
	      if (numero > maior) {  //verificação de condição 
	        segundoMaior = maior;  
	        maior = numero;  
	      }  
	      else if (numero > segundoMaior)  
	        segundoMaior = numero;  
	  
	      contador++;  
	    }  
	  
	  System.out.printf("maior:%d, segundomaior:%d" , maior ,segundoMaior);
	}// fim do main
}

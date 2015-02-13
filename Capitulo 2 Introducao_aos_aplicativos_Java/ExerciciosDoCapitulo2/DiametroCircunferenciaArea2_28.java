package ExerciciosDoCapitulo2;

//2.28 escreva um aplicativo que le a entrada a partir do usuário do raio de 
//um circulo como um inteiro e imprime o diâmetro do circulo, circunferência e 
//área do circulo utilizando o valor do ponto flutuante 3.14159 para pi.(pode utilizar a constante Math.pi.
//formulas : Diameter = 2pi , Circunference = 2pir Área = pir*r


import java.util.Scanner;

public class DiametroCircunferenciaArea2_28 
{
	public static void main ( String [] args )
	{
	 
		Scanner input = new Scanner( System.in );
		
		int raio; //ira se lido para o usuario entra com um valor para o raio.
		
		System.out.print( "Enter Number Raio:" );
		raio = input.nextInt(); // le o valor do raio.
		
		//exibindo os valores
		
		System.out.printf( "Diametro: %f\nCircunferencia: %f\nArea: %f\n" , 2 * Math.PI , 2 * Math.PI , Math.PI * Math.pow(raio, raio) ); //%f exibe com ponto flutuante
		
		
		
	}

}

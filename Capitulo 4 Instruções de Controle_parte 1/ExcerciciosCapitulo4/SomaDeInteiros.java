package ExcerciciosCapitulo4;
//exercicio 4.6
//combine as instruçoes escritas no 4.5 em um aplicativo java
//que calcule a soma dos inteiros de  1 a 10 .
//Utilize a instrução while para fazer loop pelas instruçoes de calculo e incremento
//o loop deve terminar quando o valor de x torna-se 11

public class SomaDeInteiros 
{
	public static void main( String [] args )
	{
		
		//declarando as variaveis sum e x
				int sum , x ;
				
				//atribuindo valores a variaveis sum e x
				x = 1 ;//iniciando x com valor 1
				sum = 0 ; //inciando sum com valor 0 
				
				//enquato o x for menor que 10 ,o loop continua.
				while ( x <= 10 )
				{
					sum += x ; //adicionado a variavel sum os valores da variavel x e somando
					++x ;// pre - incremnto , adiciona 1 a variavel x , funciona dos dois modo x++(pos-incremento) ou ++x(mas indicada)
				}//fim do while
				
				//imprimindo na tela.
				System.out.printf( "A soma é: %d" , sum );
	}//fim do main

}//fim da classe

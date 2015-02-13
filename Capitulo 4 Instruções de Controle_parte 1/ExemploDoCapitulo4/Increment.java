package ExemploDoCapitulo4;
// operadores de pre - incremento e pos - incremento

public class Increment 
{
	public static void main( String [] args)
	{
		//demonstra o operador de pós - incremento
		int c = 5 ; //atribui 5 á variavel c
		System.out.println( c ); //imprime 5
		System.out.println( c++ ); //imprime 5 e pos- incrementa
		System.out.println( c ); //imprime 6
		
		System.out.println();//pula uma linha
		
		//demonstra o operador de pre - incremento
		c = 5 ;//atribui 5 a variavel c
		System.out.println( c );//imprime 5
		System.out.println( ++c );//pre-incremento e imprime 6
		System.out.println( c );// imprime 6
	}//fim de main

}//fim da classe

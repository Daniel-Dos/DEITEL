package ExcerciciosCapitulo4;
//O que o seguinte programa imprime ?

//resutado: 385

//Exercicio 4_16
public class Mystery 
{
	public static void main( String [] args )
	{
		//inicializando as variaveis
		int y ; 
		int x = 1 ;
		int total = 0 ; 
		
		//controle while
		
		while( x <=10 ) // faz verificaçaõ ate 10 de x 
		{
			y = x * x ; // y recebe  o valor de x vezes o mesmo valor de x
			System.out.println( y );
			
			total += y ; // total recebe o seu valor mais o valor de y
			++x ; //pre- incrementa x com mais 1 
			
			
		}//fim do while
		System.out.printf("Total is %d" , total);
	}//fim do main

}// fim da classe 

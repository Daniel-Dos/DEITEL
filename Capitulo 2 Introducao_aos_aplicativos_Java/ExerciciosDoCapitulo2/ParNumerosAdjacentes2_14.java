package ExerciciosDoCapitulo2;

//ecercicio 2.14 do capitulo 2 do livro :
//Java Como Programar 8ª Edição.

//exiba os números 1 a 4 na mesma linha  
//com cada par de números adjacentes separados por um espaço . 
//usando os seguintes comandos:

//A) uma System.out.println
//B) 4 System.out.print
//C) uma System.out.printf


public class ParNumerosAdjacentes2_14 
{
	public static void main( String [] args )
	{
		System.out.println( "1 2 3 4  Esse é com o println" );
		System.out.print( "1 2 3 4  Esse é com o print 1 saidas \n" );
		System.out.print( "1 2 3 4  Esse é com o print 2 saidas \n" );
		System.out.print( "1 2 3 4  Esse é com o print 3 saidas \n" );
		System.out.print( "1 2 3 4  Esse é com o print 4 saidas " );
		System.out.printf( " \n%s %s " , "1 2" , "3 4  Esse é com o printf " );
		
	}

}

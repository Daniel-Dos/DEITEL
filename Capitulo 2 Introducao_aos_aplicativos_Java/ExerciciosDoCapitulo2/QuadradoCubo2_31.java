package ExerciciosDoCapitulo2;

//2.31 escreva um aplicativo  que imprima o quadrado e cubo de 0 a 10

public class QuadradoCubo2_31 
{
	public static void main ( String [] args )
	{
		
		System.out.println( "Number Quadrado Cubo" );
		
		System.out.printf( "%d\t%s\t%s\n" ,0, ( int )Math.pow( 0,2 ) , ( int )Math.pow( 0, 3 )  ); // math.pow = potencia , (int) converte para inteiro
		System.out.printf( "%d\t%s\t%s\n" ,1, ( int )Math.pow( 1,2 ) , ( int )Math.pow( 1, 3 )  );
		System.out.printf( "%d\t%s\t%s\n" ,2, ( int )Math.pow( 2,2 ) , ( int )Math.pow( 2, 3 )  );
		System.out.printf( "%d\t%s\t%s\n" ,3, ( int )Math.pow( 3,2 ) , ( int )Math.pow( 3, 3 )  );
		System.out.printf( "%d\t%s\t%s\n" ,4, ( int )Math.pow( 4,2 ) , ( int )Math.pow( 4, 3 )  );
		System.out.printf( "%d\t%s\t%s\n" ,5, ( int )Math.pow( 5,2 ) , ( int )Math.pow( 5, 3 )  );
		System.out.printf( "%d\t%s\t%s\n" ,6, ( int )Math.pow( 6,2 ) , ( int )Math.pow( 6, 3 )  );
		System.out.printf( "%d\t%s\t%s\n" ,7, ( int )Math.pow( 7,2 ) , ( int )Math.pow( 7, 3 )  );
		System.out.printf( "%d\t%s\t%s\n" ,8, ( int )Math.pow( 8,2 ) , ( int )Math.pow( 8, 3 )  );
		System.out.printf( "%d\t%s\t%s\n" ,9, ( int )Math.pow( 9,2 ) , ( int )Math.pow( 9, 3 )  );
		System.out.printf( "%d\t%s\t%s\n" ,10, ( int )Math.pow( 10,2 ) , ( int )Math.pow( 10, 3 )  );
		
	}

}

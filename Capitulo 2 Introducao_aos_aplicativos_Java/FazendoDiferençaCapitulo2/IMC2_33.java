package FazendoDiferençaCapitulo2;

import java.util.Scanner;

//2.33 calculadora de IMC - forma  mas basica , seguindo o condeudo do capitulo 2, pode ser feito de outra maneira. 

public class IMC2_33 
{
	public static void main (String [] args )
	{
		double peso, // peso da pessoa em quilogramas
	    altura , // variavel que ira armazenar o calculo.
	    imc;
	
	Scanner input = new Scanner( System.in );
	
	System.out.print("Entre com o seu peso:");
	peso = input.nextDouble() ;
	
	System.out.print( "Entrar com a sua altura:" );
	altura = input.nextDouble() ;
	
	//calculo
	imc = peso / (altura * altura ) ; // formula do calculo.
	
	
	if(imc < 18.5  )
		System.out.printf( " %F - UnderWeight" , imc );
	
	if( imc >18.5 )
		System.out.printf( "%f - Normal" , imc );
	
	if( imc >= 25)
		System.out.printf( "%f - OverWeight", imc );
	
	if( imc > 31 )
		System.out.printf( "%f - Obese" , imc );
	}

}

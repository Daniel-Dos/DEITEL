package ExcerciciosCapitulo4;
import java.util.Scanner; // importa a classe Scanner

//Exercicio 4-17s
/*
 (Quilomentro de Combustivel ) � os motoritas se preocupam com quilometragem por seus autom�veis.
  Um motorista monitorou v�rios tangues cheios de gasolina registrando a quilometragem dirigida
  e a quantidade de combust�vel em litros utilizados para cada tangue cheio. 
 Desenvolva um aplicativo java que receba como entrada os quilomentros/litro para cada 
 tangue cheio e imprimir a quilometragem combinada e a soma total de combust�vel consumidos ate esse ponto. 
 Todos os c�lculos de media dever produzir resultados de ponto flutuante. 
 Utiliza a classe scanner e repeti��o controlada por sentinela para obter os dados do usu�rios.
 */

public class QuilometroCombustivel
{
	public static void main( String [] args )
	{
		//declarando e inicializando as variaveis 
		int km = 0 ;
		int litros = 0 ;
		int kmTotal = 0 ;
		int litrosTotal = 0 ;
		double media;
		
		//criando um objeto Scanner 
		Scanner input = new Scanner( System.in) ;
		
		//entrada de dados do usuario
		System.out.println("Digite os Kilometros Dirigidos ou -1 para sair: ");
		km = input.nextInt();
		
		//repeti��o do loop , so para quando o usuario digitar -1
		while(km != -1)
		{
		   //entrada de dados do usuario para litros 
			System.out.println( "Digite os litros consumidos:" );
			litros = input.nextInt();
			
			//total de tudo 
			kmTotal += km ; // soma o valor de kmTotal mais o km
			litrosTotal += litros; //soma o valor de litrosTotal mais litros
			
			//repete novamente a entrada de kilometro
			System.out.println( "Digite os Kilometros Dirigidos ou -1 para sair:" );
			km = input.nextInt();
			
		}//fim do while
		
		//calculando a media , transforma temporariamente um tipo int em double
		media = (double) kmTotal / litrosTotal;
		
		//exibindo a media
		System.out.printf( "\nA Media por KM/L �: %.2f" , media ); // acrescenta dois digitos de precis�o(.2) e %f para numero de ponto fluantes.
		System.out.printf( "\nTotal de KM: %d" , kmTotal);
		System.out.printf( "\nTotal de Litros: %d" , litrosTotal );
	}//fim de main
}//fim da classe Exercicio4_17

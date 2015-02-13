package ExcerciciosCapitulo4;

import java.util.Scanner;

//exercicio 4_18 
//testando o programa Credito.java


public class CreditoTest 
{
	public static void main( String [] args )
	{
		int novoSaldo;
		
		//criando um novo objeto da classe Credito
		Credito credito = new Credito(0,0,0,0,0) ;
		
		//criando um objeto de scanner
		Scanner input = new Scanner (System.in) ;
		
		//entrada do numero da conta 
		System.out.println( "Seja Bem Vindo ao Java - Banking - " );
		System.out.println( "Please Enter Number of Account : - For Exit -1 " );
		credito.setNConta(input.nextInt());
		
		while(credito.getNConta() != -1)
		{
		//entra com o numero do saldo do mes
		System.out.println( "Please Enter Balance of Month:" );
		credito.setSaldoInicial(input.nextInt());
		
		//total de itens comprados
		System.out.println( "Please Enter total Buy of Month:" );
		credito.setTotalItens(input.nextInt());
		
		//total de creditos do mes 
		System.out.println( "Enter total Credits of Month:" );
		credito.setTotalCreditos(input.nextInt());
		
		//limite de credito
		System.out.println( "Enter Limit of Credit authorized" );
		credito.setLimiteCreditos(input.nextInt());
		
		//novo saldo
		
		novoSaldo = credito.getSaldoInicial() + credito.getTotalItens() - credito.getTotalCreditos() ;
		
		//decisão 
		if(novoSaldo > credito.getLimiteCreditos())
		{
			System.out.printf( "\nAccount of Number: %d  - Limit exceeded!!!!" , credito.getNConta() );
		}//fim do if
		
		else 
		{
			System.out.printf( "\nAccount of Number: %d - Limite Aproved! - congratulations" , credito.getNConta() );
		}//fim do else
		
		System.out.println( "\nSeja Bem Vindo ao Java - Banking - " );
		System.out.println( "Please Enter Number of Account : - For Exit -1 " );
		credito.setNConta(input.nextInt());
		
		}//fim do while
		System.out.println( "Thank you for using the Java - Banking" );
		
	}//fim do main
	

}//fim da classe

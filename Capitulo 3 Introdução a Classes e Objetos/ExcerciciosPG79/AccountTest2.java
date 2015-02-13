package ExcerciciosPG79;

import java.util.Scanner;

public class AccountTest2 
{
public static void main( String [] args )
	{
		Account2 conta1 = new Account2( 50.00 );
		Account2 conta2 = new Account2( -7.53 );
		
		//exibe saldo inicial
		System.out.printf( "account1 balance: $%.2f\n" , conta1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n" , conta2.getBalance() );
		
		//cria scanner
		Scanner input = new Scanner( System.in );
		double depositAmount , debitAmount;//deposito e debito
	
		//entrada para depositar
		System.out.print( "Enter deposit amount for account1: " );
		depositAmount = input.nextDouble();
		
		System.out.printf( "\nadding %.2f to account1 balance\n\n" , depositAmount);
		conta1.credit(depositAmount);
		
		//exibe saldo apos depositar na conta 1
		
		System.out.printf( "account1 balance: $%.2f\n" , conta1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n" , conta2.getBalance() );
		
		//entrada para deposito
		System.out.print( "Enter deposit amount for account2: " );
		debitAmount = input.nextDouble();
		
		System.out.printf( "\nadding %.2f to account2 balance\n\n" , debitAmount);
		conta2.credit(debitAmount);
		
		//exibe saldo apos depositar na conta 2
		System.out.printf( "account1 balance: $%.2f\n" , conta1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n" , conta2.getBalance() );
		
		//debitando conta 1
		
		System.out.print( "Enter debit amount for account1: " );//entrada de valor a ser retirado da conta1
		debitAmount = input.nextDouble();
		
		System.out.printf( "\ndebiting %.2f to account1 balance\n\n" , debitAmount);
		conta1.debit(debitAmount);
		
		//exibe saldo depois de retirar um valor qualquer na conta 1
		System.out.printf( "account1 balance: $%.2f\n" , conta1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n" , conta2.getBalance() );
		
		//debitando conta 2
		System.out.print( "Enter debit amount for account2: " );//entrada de valor a ser retirado da conta1
		debitAmount = input.nextDouble();
		
		System.out.printf( "\ndebiting %.2f to account2 balance\n\n" , debitAmount);
		conta2.debit(debitAmount);
		
		//exibe saldo depois de retirar um valor qualquer na conta 2
		System.out.printf( "account1 balance: $%.2f\n" , conta1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n" , conta2.getBalance() );
		
	}
	

}

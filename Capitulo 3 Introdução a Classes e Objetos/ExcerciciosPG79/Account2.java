package ExcerciciosPG79;

public class Account2 
{
	private double balance ;
	
	public Account2( double initialBalance )
	{
		if( initialBalance > 0.0)
			balance = initialBalance;
	}
	
	//credita
	public void credit( double amount )
	{
		balance = balance + amount;
	}

	// funçao de debita
	public void debit( double debito )
	{
	//valida que balence - debito for maior ou igual a 0.0
		//se nao for ira imprimir uma mensagem
		if( balance - debito >= 0.0 )
			balance = balance - debito;
		else
				System.out.println( "\nDEBIT AMOUNT EXCEEDED ACCOUNT BALANCE\n" );
	}
	//retorna saldo
	
	public double getBalance()
	{
		return balance;
	}

}

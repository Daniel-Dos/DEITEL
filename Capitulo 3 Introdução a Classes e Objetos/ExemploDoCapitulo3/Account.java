package ExemploDoCapitulo3;
//Figura 3.13 Account.java
//classe Account com um construtor para validar e 
//inicializar a variavel de instancia balance do tipo double.

public class Account 
{
	private double balance ; //variavel de instancia que armazena o saldo.
	
	//construtor
	public Account( double initialBalance ) 
	{
		//valida  que inicializaçao é maior que 0.0
		//se nao, o saldo é inicializado com o valor padrao 0.0
		if( initialBalance > 0.0 )
		balance = initialBalance;
		
	}//fim do construtor Account
	
	//credita ( adicional ) uma quantia á conta.
	public void credit( double amount )
	{
		balance = balance + amount ; //adiciona quantia ao saldo		
	}//fim do metodo credit
	
	//retorna o valor do saldo
	public double getBalance()
	{
		return balance ; //fornece o valor de saldo ao metodo chamador.
	}//fim do metodo getBalance

}//fim da classe Account

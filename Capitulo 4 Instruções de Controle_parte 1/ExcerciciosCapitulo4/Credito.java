package ExcerciciosCapitulo4;

//exercicio 4_18

/*
 * calculador  de limite )desenvolva um aplicativo java que determine se 
 * um cliente de uma loja de departamentos exedeu o limite de credito em uma conta- corrente. 
 * Para cada cliente , o seguintes fatos estão disponíveis:
 * 
a) numero da conta
b) saldo no inicio do mês
c)total de todos os itens ao cliente no mes
d)total de créditos aplicados ao cliente no mês
e) limite de credito autorizado

o programa deve inserir esses fatos como inteiros ,
 calcular o novo saldo ( = saldo inicial + despesas - creditos) 
 , exbir o novo saldo e determinar se o novo saldo excede ao limite de credito do cliente.
  Para aqueles clientes cujo limite de credito foi excedido , 
  o programa deve exibir a mensagem “Limite de credito excedido”.

 */
public class Credito 
{
 //criando variavel de instancia
	private int nConta  , saldoInicial , totalItens , totalCreditos , limiteCreditos ;
	
	//criando um metodo construtor da classe
	public Credito (int conta , int saldo , int itens , int creditos , int limite) {
		nConta = conta ;
		saldoInicial = saldo ;
		totalItens = itens ;
		totalCreditos = creditos ;
		limiteCreditos = limite ;
	}
	
	// gets recupera
	public int getNConta()
	{
		return nConta  ;
	}
	
	public int getSaldoInicial()
	{
		return saldoInicial ; 
	}
	
	public int getTotalItens()
	{
		return totalItens ;
	}
	
	public int getTotalCreditos()
	{
		return totalCreditos ;
	}
	
	public int getLimiteCreditos()
	{
		return limiteCreditos ;
	}
	
	//sets - configurar
	public void setNConta(int conta)
	{
		nConta = conta ;
	}
	
	public void setSaldoInicial(int saldo)
	{
		saldoInicial = saldo ;
	}
	
	public void setTotalItens(int itens)
	{
		totalItens = itens ;
	}
	
	public void setTotalCreditos(int creditos)
	{
		totalCreditos = creditos ;
	}
	
	public void setLimiteCreditos(int limite )
	{
		limiteCreditos = limite ;
	}
}

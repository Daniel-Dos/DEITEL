package ExcerciciosPG79;
//programa para testa a classe Invoice.java
public class InvoiceTest 
{
	public static void main ( String [] args)
	{
		Invoice compras = new Invoice("001" , "placa mae xp1" , 500 , 199.90); // criando um objeto do tipo invoice com seus parametros.
		
		//exbindo as informa��es do pedido.
		System.out.printf("\nNumero: %s \nDescri��o: %s \nQuantidade: %s \nPre�o: %s \nTotal: %s" , 
				compras.getNumero() , 
				compras.getDescricao() , 
				compras.getQuant() , 
				compras.GetPreco() , 
				compras.getInvoiceAmount());
		
	

		
	}

}

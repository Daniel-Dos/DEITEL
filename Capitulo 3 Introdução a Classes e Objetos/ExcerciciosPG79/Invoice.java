package ExcerciciosPG79;
//programa de loja de suplimentos de informatica.
//exercicio Invoice.java

public class Invoice 
{
	//variaveis de instania.
	
	private String numero , descricao ; //numero e descrição do item
	private int quant ; //quantidade comprada 
	private double preco ; //preço dos itens
	
	//criando um construtor da classe
	//iniciando as variaveis de instancia
	
	public Invoice(String num ,String desc , int quan , double pre)
	{
		numero = num ; 
		descricao  = desc ;
		quant = quan ;
		preco = pre ;
		
	}//fim do construtor
	
	//get de numero
	
	public String getNumero()
	{
		return numero ;
	}
	
	//set de numero
	public void setNumero(String num)
	{
		numero = num ;
	}
	
	//get de descrição
	public String getDescricao()
	{
		return descricao ;
	}
	
	//set de descrição
	public void setDescricao(String desc)
	{
		descricao = desc ;
	}
	
	//get de quantidade
	public int getQuant()
	{
		return quant ;
	}
	
	//set de quantidade
	public void setQuant(int quan)
	{
		if ( quant < 0 )
		quant = 0 ;
		else
			quant = quan ;
	}
	
	//get de preço
	public double GetPreco()
	{
		return preco ;
	}
	
	//set de preço
	public void setPreco(double pre)
	{
		if ( preco < 0.0)
		preco = 0.0 ;
		else
			preco = pre ;
	}
	
	//metodo getInvoiceAmount
	public double getInvoiceAmount()
	{
		return quant * preco ;
		
	}

}//fim da classe Invoice

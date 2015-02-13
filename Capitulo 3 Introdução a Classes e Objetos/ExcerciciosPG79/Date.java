package ExcerciciosPG79;
//aplicativo que exibe dia, mes e ano
public class Date 
{
	private int dia , mes , ano ; // variaveis de instancia
	
	//construtor
	public Date ( int day , int month , int year )
	{
		dia = day ;
		mes = month ;
		ano = year ;
	}
	
	//get de dia
	public int getDia()
	{
		return dia ;
	}
	
	//set de dia
	public void setDia( int day  )
	{
		dia = day ;
	}
	
	//get de mes
	public int getMes()
	{
		return mes ;
	}
	
	//set de mes
	public void setMes( int month)
	{
		mes = month ;
	}
	
	//get de ano
	public int getAno()
	{
		return ano ;
	}
	
	//set de ano 
	public void setAno( int year)
	{
		ano = year ;
	}
	
	//metodo que exibe as data
	public void displayDate()
	{
	
		System.out.printf("%d / %d / %d \n" , getDia() , getMes() , getAno() );
	}

}

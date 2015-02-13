package ExcerciciosPG79;
//testando a classe Date.java

public class DateTest 
{
	public static void main ( String [] args )
	{
		//criando um objeto Date e colocando paramentros
		Date data = new Date( 19, 04 , 1991 ) ;
		
		
		//chamando o metodo displayDate.
		data.displayDate();
		
		data.setDia(10); //configura dia
		data.setMes(02);//configura mes
		data.setAno(2014);//configura ano
		
		data.displayDate(); //chama o metodo com a nova modificação 
		
		
		
	}

}

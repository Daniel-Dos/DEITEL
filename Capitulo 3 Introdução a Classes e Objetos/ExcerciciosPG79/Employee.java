package ExcerciciosPG79;
//exercicio 3.14 Employee,java

public class Employee 
{
	//variveis de instancia
	private String nome , sobreNome ; // nome e sobrenome
	private double salario ; // variavel salario
	
	//construtor da classe inicializanod as variaveis.
	public Employee( String name , String sobname , double sal )
	{
		nome = name ; 
		sobreNome = sobname ;
		salario = sal ;
	}//fim do construtor Employee
	
	//get de nome
	public String getNome()
	{
		return nome ;
	}
	
	//set de nome
	public void setNome( String name)
	{
		nome = name ;
	}
	
	//get de sobrenome
	public String getSobreNome()
	{
		return sobreNome ;
	}
	
	//set de sobrenome
	public void setSobreNome( String sobname)
	{
		sobreNome = sobname ;
	}
	
	//get de salario
	public double getSalario()
	{
		return salario ;
	}
	
	//set de salario
	public void setSalario( double sal)
	{
		if(salario < 0)
			salario = 0.0 ;
		
		salario = sal ;
	}
			
	
	

}

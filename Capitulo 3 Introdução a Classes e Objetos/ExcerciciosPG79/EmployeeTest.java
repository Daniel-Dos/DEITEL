package ExcerciciosPG79;
//programa principal para executar o Employee.java
//3.14 EmployeeTest.java

public class EmployeeTest 
{
	public static void main( String [] args )
	{
		//criando dois objetos do tipo Employee
		Employee empregado1 = new Employee("Daniel", "Dias dos Santos", 364.00) ;
		Employee empregado2 = new Employee("Omega", "Ware", 1500.00) ;
		
		//exibindo tudo 
		System.out.println("===========================") ;
		System.out.println("Empregado 1") ;
		System.out.printf("\nNome: %s \nSobreNome: %s \nSalarioAnual:R$%.2f" ,empregado1.getNome() , 
				empregado1.getSobreNome() , empregado1.getSalario() * 12 ) ;
		System.out.println("\n===========================") ;
		
		System.out.println("") ;
		
		System.out.println("===========================") ;
		System.out.println("Empregado 2") ;
		System.out.printf("\nNome: %s \nSobreNome: %s \nSalarioAnual:R$%.2f" ,
				empregado2.getNome() , empregado2.getSobreNome() , empregado2.getSalario() * 12 ) ;
		System.out.println("\n===========================") ;
		
		//aumento de 10%
		empregado1.setSalario(empregado1.getSalario() * 1.1) ; // aumento de 10 %
		empregado2.setSalario(empregado2.getSalario() * 1.1 ) ;
		
		//exibindo tudo com ja aumentado
		System.out.println("Aumento de 10%");
		System.out.println("===========================") ;
		System.out.println("Empregado 1") ;
		System.out.printf("\nNome: %s \nSobreNome: %s \nSalarioAnual:R$%.2f" ,empregado1.getNome() , 
				empregado1.getSobreNome() , empregado1.getSalario() * 12 ) ;
		System.out.println("\n===========================") ;
		
		System.out.println("") ;
		
		System.out.println("===========================") ;
		System.out.println("Empregado 2") ;
		System.out.printf("\nNome: %s \nSobreNome: %s \nSalarioAnual:R$%.2f" ,
				empregado2.getNome() , empregado2.getSobreNome() , empregado2.getSalario() * 12 ) ;
		System.out.println("\n===========================") ;
		
		
	}

}

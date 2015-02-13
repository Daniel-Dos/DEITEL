package ExemploDoCapitulo3;
//Figura 3.10 GradeBook4.java
//Classe GradeBook4 com um construtor para inicializar o 
//nome do um curso.

public class GradeBook4 
{
	private String courseName; //nome do curso para esse GradeBook4
	
	//o construtor inicializa courseName com o argumento String
	public GradeBook4(String name)
	{
		courseName = name; //inicializa courseName
	}//fim do construtor.
	
	//metodo para configurar o nome do curso
	public void setCourseName(String name)
	{
		courseName = name; //armazena o nome do curso
	}//fim do mentodo set
	
	//metodo para recuperar o nome do curso
	public String getCourseName()
	{
		return courseName ;
	}//fim do metodo get
	
	//exibe uma mensagem de boas-vindas para o usuario GradeBook4
	public void displayMessage()
	{
		//essa construçao chama getcourseName para obter o
		//nome do curso que esse GradeBook4 representa.
		System.out.printf( "Welcome to the GradeBook for \n%S!\n" , getCourseName() );
	}//fim do medoto displayMessage

}

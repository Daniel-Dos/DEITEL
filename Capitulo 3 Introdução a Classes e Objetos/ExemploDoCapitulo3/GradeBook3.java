package ExemploDoCapitulo3;
//Figura 3.7: GradeBook3.java
//classe GradeBook3 que contem uma variavel de instancia
//courseName e metodos para configurar e obter seu valor.

public class GradeBook3 
{
	private String courseName; //nome do curso para essa GradeBook3 /variavel de instancia
	
	//metodos para configurar o nome do curso.
	public void setCourseName( String name )
	{
		courseName = name; //armazena o nome do curso
	} //fim do metodo setCourseName
	
	//metodo para recuperar o nome do curso
	public String getCourseName()
	{
		return courseName;
	}//fim do metodo getCourseName
	
	//exibe uma mensagem de boas-vindas para o usuario GradeBook3
	public void displayMessage()
	{
		//chama getCourseName para obter o nome do
		//o curso que essa GradeBook3 representa
		System.out.printf( "Welcome to the GradeBook for \n%s!\n" , getCourseName() );
	}

}

package ExemploDoCapitulo3;
//figura 3.11 GradeBookTest4.java
//construtor GradeBook4 utilizado para especificar o nome
//do curso na hora em que cada objeto GradeBook4 é criado.

public class GradeBookTest4 
{
	public static void main( String [] args )
	{
		//cria objeto GradeBook4
		GradeBook4 gradeBook1 = new GradeBook4( 
				"CS101 Introduction to Java Programming" );
		GradeBook4 gradeBook2 = new GradeBook4( 
				"CS102 Data Structures in Java" );
		
		//exibe valor inicial de courseName para cada GradeBook4
		System.out.printf( "gradeBook1 course name is: %s\n" , gradeBook1.getCourseName() );
		System.out.printf( "gradeBook2 course name is: %s\n" , gradeBook2.getCourseName() );
		
		System.out.println();
		
		//exibindo mensagem de boas-vindas
		gradeBook1.displayMessage(); //exibe mensagem do metodo displayMessage
		System.out.println();
		gradeBook2.displayMessage();
	}

}

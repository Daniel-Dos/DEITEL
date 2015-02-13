package ExemploDoCapitulo4;
//Cria o objeto da classe GradeBook e invoca seu metodo
//determineClasseAverage

public class GradeBookTest 
{
	public static void main ( String [] args )
	{
		//cria o objeto myGradeBook da classe GradeBook e
		//passa o nome de cursor para o construtor.
		GradeBook myGradeBook = new GradeBook (
				"CS101 Introduction to Java Programming" );
		
		myGradeBook.displayMessage();//exibe a mensagem welcome
		myGradeBook.determineClassAverage();//calcula a media das 10 notas
		
		
	}//fim de main

}//fim da classe GradeBookTest

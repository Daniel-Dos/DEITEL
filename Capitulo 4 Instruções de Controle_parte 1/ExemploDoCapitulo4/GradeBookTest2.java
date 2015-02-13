package ExemploDoCapitulo4;
//Cria o objeto da classe GradeBook2 e invoca seu metodo determineClassAverage

public class GradeBookTest2 
{
	public static void main( String [] args)
	{
		//cria o objeto myGradeBook2 da classe Gradebook2
		//passa o nome de cursor para o construtor.
		
		GradeBook2 myGradeBook2 = new GradeBook2( 
				"CS101 Introduction to Java Programming" );
		
		myGradeBook2.displayMessage();//exibe a mensagem welcome
		myGradeBook2.determineClassAverage(); //calcula a media
	}//fim da main

}//fim da classe GradeBookTest2

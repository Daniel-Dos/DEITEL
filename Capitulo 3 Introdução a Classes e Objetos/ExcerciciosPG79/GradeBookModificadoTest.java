package ExcerciciosPG79;


public class GradeBookModificadoTest 
{
	//metodo main inicia a execução de programa
		public static void main( String [] args )
		{
			///cria objeto GradeBook4
			GradeBookMoficado gradeBook1 = new GradeBookMoficado( 
					"CS101 Introduction to Java Programming" , "Daniel Dias" );
			GradeBookMoficado gradeBook2 = new GradeBookMoficado( 
					"CS102 Data Structures in Java" , "Daniel Dias");
			
			//exibe valor inicial de courseName para cada GradeBook4
			System.out.printf( "gradeBook1 course name is: %s\n" , gradeBook1.getCourseName() );
			System.out.printf( "gradeBook2 course name is: %s\n" , gradeBook2.getCourseName() );
			
			System.out.println();
			
			//exibindo mensagem de boas-vindas
			gradeBook1.displayMessage(); //exibe mensagem do metodo displayMessage
			System.out.println();
			gradeBook2.displayMessage();
		}//fim de main


}

package ExemploDoCapitulo3;
//Figura 3.8 GradeBookTest3.java
//Criando e manipulando um objeto GradeBook3
import java.util.Scanner;

public class GradeBookTest3 
{
	//metodo main
	public static void main( String [] args )
	{
		//cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner( System.in );
		
		//cria um objeto GradeBook3 e o atribui a myGradeBook
		GradeBook3 myGradeBook = new GradeBook3();
		
		//exibe valor inicial de courseName
		System.out.printf( "Initial course name is: %s\n\n" ,myGradeBook.getCourseName() );
		
		//solicita e le o nome do curso
		System.out.println( "Please enter the course name:" );
		String theName = input.nextLine();//le linha de texto
		myGradeBook.setCourseName(theName); //configura o nome do curso
		System.out.println();// gera saida de uma linha em branco
		//exibe mensagem de boas-vindas depois de especificar o
		//nome do curso
		myGradeBook.displayMessage();
	}

}

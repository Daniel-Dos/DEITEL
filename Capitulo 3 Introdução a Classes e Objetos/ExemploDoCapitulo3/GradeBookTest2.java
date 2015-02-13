package ExemploDoCapitulo3;

//Figura 3.5 GradeBookTest2.java
//Cria objeto GradeBook e passa uma Strig para
//seu metodo displayMessage
import java.util.Scanner;//programa utiliza o Scannner

public class GradeBookTest2 
{
	//metodo main inicia a execução de programa
	public static void main( String [] args )
	{
		//cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner( System.in );
		
		//cria um objeto GradeBook2 e o atribui a myGradeBook
		GradeBook2 myGradeBook = new GradeBook2();
		
		//prompt para entrada do nome do curso
		System.out.println( "Please enter the course name: " );
		String nameOfCourse = input.nextLine(); //le uma linha de texto
		System.out.println(); //gera saida de uma linha em branco
		
		//chama metodo displayMessage de myGradeBook
		//e passa nameOfCourse como um argumento
		myGradeBook.displayGradeBook(nameOfCourse);
	}//fim de main

}//fim da classe GradeBookTest2

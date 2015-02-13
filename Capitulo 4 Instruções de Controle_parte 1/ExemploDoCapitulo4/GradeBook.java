package ExemploDoCapitulo4;
//Classe GradeBook que resolve o problema da media da classe.
//utilizando repetição controlada por contador.
import java.util.Scanner;

public class GradeBook 
{
	private String courseName ; //nome do curso que esse GradeBook representa.
	
	//o construtor inicializa courseName
	public GradeBook( String name)
	{
		courseName = name ; //inicializa courseName.
	}//fim do construtor

	//metodo para configurar o nome do curso
	public void setCourseName( String name)
	{
		courseName = name ; //armazena o nome do curso
	}//fim do metodo setCourseName
	
	//metodo para recuperar o nome do curso
	public String getCourseName()
	{
		return courseName ;
	}//fim do getcourseName
	
	//exibe uma mensagem de boas - vindas ao usuario GradeBook
	public void displayMessage()
	{
		//getCourseName obtém o nome do curso
		System.out.printf( "Welcome to the GradeBook for\n%s!\n\n" ,getCourseName());
	}//fim do metodo displayMessage
	
	//determina a media da classe com base em 10 notas inseridas.
	public void determineClassAverage()
	{
		//cria Scanner para obter entrada da janela de comando.
		Scanner input = new Scanner( System.in ) ;
		
		int total ; //soma das notas inseridas pelo usuario
		int gradeCounter ; //numero da nota a ser inserida a seguir.
		int grade ; //valor da nota inserida pelo usuario
		int average ; //media das notas.
		
		//fase de inicialização 
		total = 0 ; //inicializa total
		gradeCounter = 1 ; //inicaliza o contador de loops
		
		//fase de processamento
		while( gradeCounter <= 10 )//faz o loop 10 vezes.
		{
			System.out.print( "Enter grade: " );//prompt
			grade = input.nextInt();//insere a proxima nota
			total = total + grade ; //adiciona grade a total
			gradeCounter = gradeCounter + 1 ; //incrementa o contator por 1
			
		}//fim do while
		
		//fase de termino
		average = total / 10  ; //divisão de ints produz um int.
		
		//exibe o total e a media das notas.
		System.out.printf( "\nTotal of all 10 grades is %d\n" , total );
		System.out.printf( "Class average is %d\n" , average );
	}//fim do metodo determineClassAverage
	
}//fim da classe GradeBook

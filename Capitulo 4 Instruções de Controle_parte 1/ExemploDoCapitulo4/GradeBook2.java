package ExemploDoCapitulo4;
//Classe GradeBook2 que resolve o programa da media da classe
//utilizando repetição controlada por sentinela
import java.util.Scanner ;

public class GradeBook2 
{
	private String courseName ; //nome do curso que essa GradeBook2 representa
	
	public GradeBook2( String name )
	{
	courseName = name ;//inicializa courseName	
	}//fim do construtor
	
	//metodo para configurar o nome do curso
	public void setCourseName(String name)
	{
		courseName = name ;//armazena o nome do curso
	}//fim do metodo setCourseName
	
	//metodo para recuperar o nome do curso
	public String getCourseName()
	{
		return courseName ;
	}//fim do metodo getCourseName
	
	//exibe uma mensagem de boas-vindas para o usuario GradeBook2
	public void displayMessage()
	{
		//getCourseName obtem o nome do curso
		System.out.printf( "Welcome to the GradeBook for\n%s!\n\n" , getCourseName() );
	}//fim do metodo displayMessage
	
	//determina a media de um numero arbitrario de notas
	public void determineClassAverage()
	{
		//cria Scanner para obter entrada da janela de comando
		Scanner input = new Scanner( System.in );
		
		int total ; //soma das notas
		int gradeCounter ; //numeros de notas inseridas
		int grade ; //valor da nota
		double average ; //numero com ponto de fraçao decimal para a media.
		
		//fase de inicializaçao
		total = 0 ; //inicializa o total
		gradeCounter = 0 ; //inicializa o contador de loops
		
		//fase de processamento
		//solicita entrada e le a nota do usuario
		System.out.print( "Enter grade or -1 to quit: " );
		grade = input.nextInt();
		
		//faz um loop ate ler o valor de sentinela inserido pelo usuario
		while( grade != -1)
		{
			total = total + grade ;//adiciona grade a total
			gradeCounter = gradeCounter + 1 ; //incrementa counter
			
			//solicita entrada e le a proxima nota fornecida pelo usuario
			System.out.print( "Enter grade or 1 to quit:" );
			grade = input.nextInt() ;
		}//fim do while
		
		//fase do termino
		//se o usuario inseriu pelo menos uma nota...
		if(gradeCounter != 0 )
		{
			//calcula a media de todas as notas inseridas
			average = (double) total / gradeCounter ;
			
			//exibe o total e a media ( com 2 digitos de precisao)
			System.out.printf( "\nTotal of the %d grades entered is %d\n" , gradeCounter , total );
			System.out.printf( "Class average is %.2f\n" , average );
			
		}//fim do if
		else //nenhuma nota foi inserida, entao gera uma mensagem apropriada
			System.out.println( "No grades were entered" );
	}//fim do metodo determineClassAverage
	
	

}//fim da classe GradeBook2

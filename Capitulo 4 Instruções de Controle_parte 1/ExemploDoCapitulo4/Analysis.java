package ExemploDoCapitulo4;
//Analise dos resultados dos exames
import java.util.Scanner;

public class Analysis 
{
	public static void main( String [] args ) 
	{
		//cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner( System.in ) ;
		
		//inicializando variaveis nas declara��es.
		int passes = 0 ; //numero de aprova��es
		int failures = 0 ; //numero de reprova��es.
		int studentCounter = 1 ; //contador de alunos.
		int result ; //um resultado do exame ( fornecido pelo usuario ).
		
		//processa 10 alunos com o loop controlado por contador.
		while(studentCounter <= 10 )
		{
			//solicita ao usuario uma entrada e obtem o valor fornecido pelo usuario
			System.out.print( "Enter result ( 1 = pass , 2 = fail): " );
			result = input.nextInt();
			
			//if ... else aninhado em while
			if( result  == 1) //se resultar 1 
				passes = passes + 1 ; //incrementa aprova��es.
			else //caso contrario , resultado n�o � 1 , ent�o
				failures = failures + 1 ;//imcrementa reprova��es.
			
			//incrementa studentCounter ate o loop terminar
			studentCounter = studentCounter + 1 ;
		}//fim do while
		
		//fase de termino ; prepara e exibe os resultados
		System.out.printf( "Passed: %d\nFailed: %d\n" , passes , failures );
		
		//determina se mais de 8 alunos foram aprovados.
		if( passes > 8 )
			System.out.println( "Bonus to Intructor!" );
	}//fim do main

}//fim da classe

package ExcerciciosCapitulo4;

//exercicio 4_20
/**
 * desenvolva um aplicativo java que determina o salario bruto de cada um de três empregados.
 *  A empresa paga as horas normais pelas primeira 40 horas trabalhadas de cada funcionário e 50% a mais pelas horas trabalhadas além das 40 horas.
 *   Você recebe uma lista de empregados, o numero de horas trabalhadas que eles trabalharam na semana passada e o salario-hora de cada empregado. 
 *   Seu programa deve aceitar a entrada dessas informações para cada empregado e
 *  , então determinar e exibir o salario bruto do empregado. Utilize a classe scanner para inserir os dados.
 *  */

import java.util.Scanner ;
public class CalculadorSalarios 
{
	public static void main( String [] args )
	{
		//variaveis 
		int selecao ;
		double salario  , novo_Sal; //variavel ara salario e novo salario
		double hora_Trabalho ;// variavel para hora trabalho que trabalha , 220 , 200, 44 , 30 , 6 etc
		double sal_Hora ; // variavel que vai armazena o calculo para saber o salario hora
		double uma_Hora_extra , total_Hora_extra ,hora_extra_trab ; //variaveis para horas extras  (1- para saber o valor de 1 hora extra) , (2 - armazena o calculo total de quanto vai reber por hora exta ) , (3 - usuario ira colocar quantas hora fez depois do seu horario)
		
		//cria um objeto scanner 
		Scanner input = new Scanner ( System.in );
		System.out.println( "Digite o numero do empregado para ajustar o salario: " );
		selecao = input.nextInt();
		
		//para selecionar qual empregado vai receber reajuste
		if( selecao == 1 ) 
		{
		//entrada de usuario
		System.out.println( "Digite o salario do Funcionario 1:" );
		salario = input.nextDouble();
		
		//entrada de hora - trabalho
		System.out.println( "Digite as horas mensais trabalhadas do Funcionario 1:" );
		hora_Trabalho = input.nextDouble();
		
		sal_Hora = salario / hora_Trabalho;//achar o salario hora 
		
		//achar valor de uma hora extra
		uma_Hora_extra = sal_Hora + 1.5 ;
		
		
		System.out.println( "Digita Quantas HORAS-EXTRA Trabalhadas do Funcionario 1:" );
		hora_extra_trab = input.nextDouble();
		total_Hora_extra = uma_Hora_extra * hora_extra_trab ;//achar o valor a receber por todas as horas extras.
		
		//mostrando o novo salario
		novo_Sal = salario + total_Hora_extra ;
		System.out.printf( "Funcionario 1  vai receber : R$%.2f" , novo_Sal );
		
		System.out.println( "Obrigado Por Utilizar Nosso Sistema ! " );
		}//fim do primeiro if
		
		else if(selecao == 2 )
		{
			//entrada de usuario
			System.out.println( "Digite o salario do Funcionario 2:" );
			salario = input.nextDouble();
			
			//entrada de hora - trabalho
			System.out.println( "Digite as horas mensais trabalhadas do Funcionario 2:" );
			hora_Trabalho = input.nextDouble();
			
			sal_Hora = salario / hora_Trabalho;//achar o salario hora 
			
			//achar valor de uma hora extra
			uma_Hora_extra = sal_Hora + 1.5 ;
			
			
			System.out.println( "Digita Quantas HORAS-EXTRA Trabalhadas do Funcionario 2:" );
			hora_extra_trab = input.nextDouble();
			total_Hora_extra = uma_Hora_extra * hora_extra_trab ;//achar o valor a receber por todas as horas extras.
			
			//mostrando o novo salario
			novo_Sal = salario + total_Hora_extra ;
			System.out.printf( "Funcionario 2 vai receber : R$%.2f" , novo_Sal );
			
			System.out.println( "Obrigado Por Utilizar Nosso Sistema ! " );
		}//fim do primeiro else if 
		
		else if(selecao == 3)
		{
			//entrada de usuario
			System.out.println( "Digite o salario do Funcionario 3:" );
			salario = input.nextDouble();
			
			//entrada de hora - trabalho
			System.out.println( "Digite as horas mensais trabalhadas do Funcionario 3:" );
			hora_Trabalho = input.nextDouble();
			
			sal_Hora = salario / hora_Trabalho;//achar o salario hora 
			
			//achar valor de uma hora extra
			uma_Hora_extra = sal_Hora + 1.5 ;
			
			
			System.out.println( "Digita Quantas HORAS-EXTRA Trabalhadas do Funcionario 3:" );
			hora_extra_trab = input.nextDouble();
			total_Hora_extra = uma_Hora_extra * hora_extra_trab ;//achar o valor a receber por todas as horas extras.
			
			//mostrando o novo salario
			novo_Sal = salario + total_Hora_extra ;
			System.out.printf( "Funcionario 3 vai receber : R$%.2f" , novo_Sal );
			
			System.out.println( "Obrigado Por Utilizar Nosso Sistema ! " );
		}//fim do segundo else if
		else {
			
			System.out.println("Funcionario não encontrado!!!\nObrigado Por Utilizar Nosso Sistema !");
		}
		
		
	}//fim de main

}//fim da classe

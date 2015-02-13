package ExcerciciosCapitulo4;


//exercici 4-19 - ComissaoDeVendas.java 

//descriçaõ 
/**
 * Uma grade empresa paga seu pessoal de vendas por comissão. 
 * O pessoal de vendas recebe R$ 200 por semana mas 9% de suas vendas brutas durante essa semana. 
 * Por exemplo , um vendedor que realiza um total de vendas de mercadoria de R$5.000 em uma semana recebe R$ 200 mas 9% de R$5.000, ou um totl de R$650; 
 * foi-lhe fornecida uma lista dos itens vendidos por cada vendedor. Os valores desses itens são como segue:
-1 – 239,99
-2 – 129.75
-3 – 99.95
- 4 – 350.89
Desenvolva um aplicativo java que recebe entrada de itens vendidos por um vendedor durante a ultima semana e calcular e exibe os rendimentos do vendedor. 
Não existe nenhum limite para o numero de itens pode ser vendido.

 * */

import java.util.Scanner ;
public class ComissaoDeVendas 
{
	public static void main( String [] args )
	{
		double  sal_Vendedor = 200.00;
		int total_Itens  = 0 ; 
		
		//criando um objeto scanner 
		Scanner input = new Scanner ( System.in ) ;
		
		System.out.println( "enter the item number - -1 for Exit: " );
		total_Itens = input.nextInt();
		
		//repetição
		while(total_Itens != -1 )
		{
			if(total_Itens == 1 )
			{
				sal_Vendedor += total_Itens + 0.09 * 239.99 ; // igual a sal_Vendedor = Sal_vendedor + total_Itens +0.09 * 239.99
			}//fim do if
			
			else if (total_Itens == 2 )
			{
				sal_Vendedor += total_Itens + 0.09 * 129.75 ;
			}//fim do primiero else if
			
			else if (total_Itens == 3)
			{
				sal_Vendedor += total_Itens + 0.09 * 99.95 ;
			}//fim do segundo else if
			
			else
			{
				sal_Vendedor += total_Itens + 0.09 * 350.89 ;
			}//fim do else 
			
			System.out.println( "enter the item number - -1 for Exit : " );
			total_Itens = input.nextInt();
				
		}//fim do while
		System.out.printf( "Total de rendimentos do Vendedor: %.2f" , sal_Vendedor );
	}

}

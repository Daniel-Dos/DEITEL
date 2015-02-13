package ExcerciciosCapitulo4;

/**
 * 4.25 - O que oo seguinte Programa Imprime ?
 * 
 * */

public class Mystery2 {
	public static void main(String[] args) {

		int count = 1;

		while (count <= 10) {
			System.out.println(count % 2 == 1 ? "****" : "++++++++");
			++count; // pre - incremento
		}// fim do while
	}// fim do main

} // fim da class

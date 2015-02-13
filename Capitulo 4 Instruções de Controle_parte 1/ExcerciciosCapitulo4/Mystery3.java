package ExcerciciosCapitulo4;

/** 4.26 - o que esse programa imprime */

public class Mystery3 {
	public static void main(String[] args) {
		int row = 10;
		int column;

		while (row >= 1) {
			column = 1;
			while (column <= 10) {
				System.out.println(row % 2 == 1 ? "<" : ">");
				++column;

			} // fim do while
			--row;
			System.out.println();

		}// fim do while

	} // fim do main
} // fim da class

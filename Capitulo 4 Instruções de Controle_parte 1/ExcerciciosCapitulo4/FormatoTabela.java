package ExcerciciosCapitulo4;

/**
 * 4.22 (Saida no formato tabela)
 * 
 * Escreva um aplicativo java que utiliza um loop para imprimir a seguinte
 * tabela:
 * 
 * N 10*N 100*N 1000*N 1 10 100 1000 2 20 200 2000 3 30 300 3000 4 40 400 4000 5
 * 50 500 5000
 * 
 * 
 * */

public class FormatoTabela {
	public static void main(String[] args) {

		int n = 1; // inicializando a variavel

		System.out.println("N  10*N  100*N  1000*N");

		while (n < 6) { // loop de execuçao

			System.out.printf("%d  %d    %d    %d\n", n, n * 10, n * 100,
					n * 1000);
			n++;

		}
	}

}

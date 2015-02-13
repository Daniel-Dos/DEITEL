package ExcerciciosCapitulo4;

/**
 * 4.24 - modifique o programa da figura 4.12 para validar suas entradas para
 * qualquer entrada ,se o valor inserido for diferente de 11 ou 2 ,continue o
 * loop ate o usuario inserir um valor correto.
 * 
 * */

import java.util.Scanner;


public class ValidanoEntradaUsuario {
	public static void main(String[] args) {
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		// inicializando variáveis nas declarações
		int passes = 0; // número de aprovações
		int failures = 0; // número de reprovações
		int studentCounter = 1; // contador de alunos
		int result; // um resultado do exame (obtém o valor a partir do usuário)

		// processa 10 alunos utilizando o loop controlado por contador
		while (studentCounter <= 10) {
			result = 0;

			// solicita ao usuário uma entrada e obtém valor fornecido pelo
			// usuário
			System.out.print("Enter result (1 = pass, 2 = fail): ");

			while ((result != 1) && (result != 2)) {
				result = input.nextInt();
				if ((result != 1) && (result != 2))
					System.out.println("Invalid input");
			}

			// if...else aninhado em while
			if (result == 1) // if resultar 1,
				passes = passes + 1; // incrementa aprovações;
			else
				// else resultado não é 1, então
				failures = failures + 1; // incrementa reprovações

			// incrementa studentCounter até o loop terminar
			studentCounter = studentCounter + 1;
		} // fim do while

		// fase de término; prepara e exibe os resultados
		System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);

		// determina se mais de 8 alunos foram aprovados
		if (passes > 8)
			System.out.println("Raise Tuition");
	}// fim do main

}

package EstudoDeCasoDeGUI3_9;

//programa do exercio de estudo de caso de gui1 3.9
//adiçao modo grafico
//Desenvolvido por: Daniel Dias
import javax.swing.JOptionPane;

public class AdditionGUI {
	public static void main(String[] args) {
		int soma, num1, num2; // tem que declarar variaveis para poder usar o
								// parseInt();

		// pede para o usuario entra com o primeiro numero.
		String number1 = JOptionPane.showInputDialog("Enter a Number1:");
		String number2 = JOptionPane.showInputDialog("Enter a Number2");

		num1 = Integer.parseInt(number1);
		num2 = Integer.parseInt(number2);// converte String para int

		// somando
		soma = num1 + num2;

		// criando uma mensagem
		String mensagem = String.format("A soma é: %s", soma);

		// exibindo
		JOptionPane.showMessageDialog(null, mensagem);

	}

}

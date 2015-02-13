package EstudoDeCasoDeGUI3_9;

//Figura 3.18 NameDialog.java
//Entrada basica com uma caixa de dialogo.s
import javax.swing.JOptionPane;

public class NameDialog {
	public static void main(String[] args) {
		// pede para o usuario inserir seu nome
		String nome = JOptionPane.showInputDialog("What is your name?");

		// cria a mensagem
		String message = String.format("Welcome,  %s, to Java Programing!",
				nome); // format igual a prinf()

		// exibe a mensagem para comprimentar o usuario pelo nome.
		JOptionPane.showMessageDialog(null, message);
	}
}

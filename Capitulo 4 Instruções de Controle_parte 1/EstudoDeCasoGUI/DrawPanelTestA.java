package EstudoDeCasoGUI;

import javax.swing.JFrame;

public class DrawPanelTestA 
{
	public static void main(String [] args )
	{
		//cria um painel para o nosso desenho
		DrawPanelA  panel = new DrawPanelA() ;
		
		//cria uma janela
		JFrame app = new JFrame();
		
		//configura o frame para ser encerrado.
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//adicona  panel ao frame
		
		app.add(panel);//adicona panel ao frame
		app.setSize(250 , 250 ); //tamanho da janela
		app.setVisible(true);//torna o frame visivel
		app.setTitle("DrawPanel A");//adiciona titulo
		
	}


}

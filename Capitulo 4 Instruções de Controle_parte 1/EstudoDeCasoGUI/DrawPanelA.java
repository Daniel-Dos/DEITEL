package EstudoDeCasoGUI;

import java.awt.Graphics;

import javax.swing.JPanel;

//exercicio de estudo de Caso GUI
//exercicio A do capitulo 4 figura 4.20
public class DrawPanelA extends JPanel
{
	public void paintComponent( Graphics g)
	{
		//Chama paintComponent para assegurar que o painel seja exibido corretamente
		super.paintComponent(g);
		
		int width = 0;
		int height = 0 ;
		int linhas = 1 ; 
		
		while ( linhas <= 15) 
		{
			width += getWidth() / 15 ;
			g.drawLine(0, width, height, getHeight());
			height += getHeight() / 15 ;
			linhas++ ;
			
		}//fim do while
	}//fim do paintComponet
	

}//fim da classe

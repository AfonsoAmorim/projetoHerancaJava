package curso.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

// swing � um framework Java para Desktop 
public class TelaTimeOne extends JDialog {

	//construtor executa o que tiver dentro no momento de abertura ou execu��o
	public TelaTimeOne() {
		setTitle("Primeira Tela com JDialog");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		//Acima base da tela no Desktop
		
		
		
		
		
		setVisible(true);// cria a tela vis�vel para usu�rio, deve ser o �ltimo comando 
	}
	
}

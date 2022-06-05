package curso.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

// swing é um framework Java para Desktop 
public class TelaTimeOne extends JDialog {

	//construtor executa o que tiver dentro no momento de abertura ou execução
	public TelaTimeOne() {
		setTitle("Primeira Tela com JDialog");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		//Acima base da tela no Desktop
		
		
		
		
		
		setVisible(true);// cria a tela visível para usuário, deve ser o último comando 
	}
	
}

package curso.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.rmi.activation.ActivationGroupID;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// swing � um framework Java para Desktop 
public class TelaTimeOne extends JDialog {

	// Pa�nel de componentes
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	private JLabel descricaoHora = new JLabel("Time da 1� Thread");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time da 2� Thread");
	private JTextField mostraTempo2 = new JTextField();
	
	
	//construtor executa o que tiver dentro no momento de abertura ou execu��o
	public TelaTimeOne() {
		setTitle("Primeira Tela com JDialog");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		//Acima base da tela no Desktop
		
		GridBagConstraints gridBagOne = new GridBagConstraints();
		gridBagOne.gridx = 0;
		gridBagOne.gridy = 0;
		
		descricaoHora.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricaoHora, gridBagOne);
		gridBagOne.gridy++;
		mostraTempo.setPreferredSize(new Dimension(200,25));
		jPanel.add(mostraTempo, gridBagOne);
		
		
		descricaoHora2.setPreferredSize(new Dimension(200,25));
		gridBagOne.gridy++;
		jPanel.add(descricaoHora2, gridBagOne);
		
		mostraTempo2.setPreferredSize(new Dimension(200,25));
		gridBagOne.gridy++;
		jPanel.add(mostraTempo2, gridBagOne);
		
		add(jPanel, BorderLayout.WEST);
		setVisible(true);// cria a tela vis�vel para usu�rio, deve ser o �ltimo comando 
	}
	
}

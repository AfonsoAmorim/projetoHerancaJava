package curso.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.activation.ActivationGroupID;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// swing é um framework Java para Desktop 
public class TelaTimeOne extends JDialog {

	// Paínel de componentes
	private JPanel jPanel = new JPanel(new GridBagLayout());

	private JLabel descricaoHora = new JLabel("Time da 1° Thread");
	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("Time da 2° Thread");
	private JTextField mostraTempo2 = new JTextField();

	private JButton jButtonOne = new JButton("Start");
	private JButton jButtonTwo = new JButton("Stop");

	private Runnable threadOne = new Runnable() {

		@Override
		public void run() {
			while (true) {
				mostraTempo
						.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	};

	

	private Runnable threadTwo = new Runnable() {

		@Override
		public void run() {
			while (true) {
				mostraTempo2
						.setText(new SimpleDateFormat("dd/MM/yyy hh:mm:ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	};
	
	private Thread threadOneTime;
	private Thread threadTwoTime;	

	// construtor executa o que tiver dentro no momento de abertura ou execução
	public TelaTimeOne() {
		setTitle("Primeira Tela com JDialog");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		// Acima base da tela no Desktop

		GridBagConstraints gridBagOne = new GridBagConstraints();
		gridBagOne.gridx = 0;
		gridBagOne.gridy = 0;
		gridBagOne.gridwidth = 2;
		gridBagOne.insets = new Insets(5, 10, 5, 5);
		gridBagOne.anchor = GridBagConstraints.WEST;

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagOne);
		gridBagOne.gridy++;
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagOne);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagOne.gridy++;
		jPanel.add(descricaoHora2, gridBagOne);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		mostraTempo2.setEditable(false);
		gridBagOne.gridy++;
		jPanel.add(mostraTempo2, gridBagOne);

		gridBagOne.gridwidth = 1;

		jButtonOne.setPreferredSize(new Dimension(92, 25));
		gridBagOne.gridy++;
		jPanel.add(jButtonOne, gridBagOne);

		jButtonTwo.setPreferredSize(new Dimension(92, 25));
		gridBagOne.gridx++;
		jPanel.add(jButtonTwo, gridBagOne);

		jButtonOne.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				threadOneTime = new Thread(threadOne);
				threadOneTime.start();

				threadTwoTime = new Thread(threadTwo);
				threadTwoTime.start();
				
				jButtonOne.setEnabled(false);
				jButtonTwo.setEnabled(true);
				
			}
		});

		jButtonTwo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				threadOneTime.stop();
				threadTwoTime.stop();
			
				jButtonOne.setEnabled(true);
				jButtonTwo.setEnabled(false);
			
			}
		});
		
		
		jButtonTwo.setEnabled(false);

		add(jPanel, BorderLayout.WEST);
		setVisible(true);// cria a tela visível para usuário, deve ser o último comando

	}

}

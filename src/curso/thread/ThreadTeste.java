package curso.thread;

import javax.swing.JOptionPane;

public class ThreadTeste {

	public static void main(String[] args) throws InterruptedException {

		new Thread() {
			public void run() {// executa o que nós queremos

				// código para processo paralelo
				for (int posicao = 0; posicao < 5; posicao++) {

					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					// Teste de Thread para tempo de parada ou tempo determinado
					System.out.println("Executando uma rotina para testar o conceito de Thread");

				}
				System.out.println("Fim do 1° trecho de código!!");

			}

		}.start();// Start que liga a Thread que fica processando paralelamente

		JOptionPane.showMessageDialog(null, "Continuação do sistema em funcionamento.");

	}

}

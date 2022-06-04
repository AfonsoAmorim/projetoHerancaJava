package curso.thread;

import javax.swing.JOptionPane;

public class ThreadTeste {

	public static void main(String[] args) throws InterruptedException {

		new Thread(threadOne).start();
		new Thread(threadTwo).start();
		JOptionPane.showMessageDialog(null, "Continuação do sistema em funcionamento.");

	}

	private static Runnable threadOne = new Runnable() {

		@Override
		public void run() {

			// código para processo paralelo
			for (int posicao = 0; posicao < 5; posicao++) {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				// Teste de Thread para tempo de parada ou tempo determinado
				System.out.println("Executando uma rotina para testar o conceito de Thread");

			}
			System.out.println("Fim do 1° trecho de código!!");

		}
	};

	private static Runnable threadTwo = new Runnable() {

		@Override
		public void run() {
			// código para processo paralelo
			for (int posicao = 0; posicao < 5; posicao++) {

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				// Teste de Thread para tempo de parada ou tempo determinado
				System.out.println("Executando um envio de NF");

			}
			System.out.println("Fim do 2° trecho de código!!");

		}
	};

}

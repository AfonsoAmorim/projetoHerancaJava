package curso.thread;

public class ThreadAfonso {

	public static void main(String[] args) {

		new Thread() {
			public void run() {
				int numero = 10;
				if (numero < 5) {
					System.out.println("Seu número é menor que 5");
				} else {
					System.out.println("Seu número é maior que 5");
				}

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

				for (int number = 1; number < 6; number++) {
					System.out.println("O processamento continua " + " atualmente na posição " + number);

					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			}
		}.start();

	}

}

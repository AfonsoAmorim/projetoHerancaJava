package curso.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementaFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_filha.add(objetoFilaThread);
	}

	@Override
	public void run() {
		Iterator interacao = pilha_filha.iterator();

		synchronized (interacao) {// bloqueia o acesso a essa lista por outros processos

			while (interacao.hasNext()) { // Enquanto conter dados na lista irá processar
				ObjetoFilaThread processar = (ObjetoFilaThread) interacao.next();

				System.out.println("-------------------------");
				System.out.println(processar.getNome());
				System.out.println(processar.getNome());
				System.out.println("-------------------------");
				// Aqui você faz os processos: processar algo, gerar uma lista grande de PDF
				interacao.remove();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}

	}

}

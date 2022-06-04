package com.curso.testavel;

import javax.swing.JOptionPane;

import com.curso.Disciplina;

public class Arrays {

	public static void main(String[] args) {
		
		String inserirPosicoes = JOptionPane.showInputDialog("Quantas notas têm: ? ");
		
		//sempre colocar uma quantidade de posições no array
		double notas[] = new double[Integer.parseInt(inserirPosicoes)];
		
		for (int posicoes=0;posicoes<notas.length;posicoes++) {
			String valoresPosicoes = JOptionPane.showInputDialog("Inserir as notas:" + posicoes);
			notas[posicoes]=Double.valueOf(valoresPosicoes);
		}
		
	
		for (int i=0; i<notas.length;i++) {
			if(notas[i]>=5) {
				System.out.println("50% do valor da nota que será considerada: " + notas[i]*(0.5)); 
			}else {
				System.out.println("Nota baixa: " + notas[i] + " será descartada");
			}
			
		}
	
		
		
		
		
		
		
		
		
		
		

	}
}

package com.curso.testavel;

import com.curso.Aluno;
import com.curso.Diretor;
import com.curso.Secretario;

public class TesteSubClasse {

	public static void main(String[] args) {
		Aluno alunoA = new Aluno();
		alunoA.setNome("João Amorim");
		alunoA.setIdade(23);

		Diretor diretorA = new Diretor();
		diretorA.setNome("Alex Vargas");
		diretorA.setrG("555666");

		Secretario secretarioA = new Secretario();
		secretarioA.setNome("Joana Alves");
		secretarioA.setExperiencia("10 anos");

		System.out.println(alunoA);
		System.out.println(diretorA);
		System.out.println(secretarioA);
	
	
	}

}

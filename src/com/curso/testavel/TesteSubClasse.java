package com.curso.testavel;

import com.curso.Aluno;
import com.curso.Diretor;
import com.curso.Pessoa;
import com.curso.Secretario;

public class TesteSubClasse {

	public static void main(String[] args) {
		Aluno alunoA = new Aluno();
		alunoA.setNome("João Amorim");
		alunoA.setIdade(15);

		Diretor diretorA = new Diretor();
		diretorA.setNome("Alex Vargas");
		diretorA.setrG("555666");
		diretorA.setIdade(55);

		Secretario secretarioA = new Secretario();
		secretarioA.setNome("Joana Alves");
		secretarioA.setExperiencia("10 anos");
		secretarioA.setIdade(28);

		System.out.println(alunoA.pessoaMaiorIdade());

		System.out.println("Valor do salário do Diretor é: R$ " + diretorA.salario());

		testePolimorfismo(alunoA);
		testePolimorfismo(diretorA);
		testePolimorfismo(secretarioA);

	}

	public static void testePolimorfismo(Pessoa pessoa) {
		System.out.println("Essa pessoa é: " + pessoa.getNome() + " sua idade é: " + pessoa.getIdade());
	}

}

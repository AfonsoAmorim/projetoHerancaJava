package com.curso;

public abstract class Pessoa {

	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String rG;
	
	
	public abstract double salario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getrG() {
		return rG;
	}

	public void setrG(String rG) {
		this.rG = rG;
	}

	public int pessoaMaiorIdade() {
		if (idade >= 18) {
			System.out.println("É maior de idade!");
		} else {
			System.out.println("É menor de idade!");
		}
		return idade;
	}

}

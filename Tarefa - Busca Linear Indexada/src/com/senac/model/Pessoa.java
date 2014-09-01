package com.senac.model;


public class Pessoa {

	private String nome;
	private String endereco;
	private String [] telefones;
	
	public Pessoa(String nome, String endereco, String[] telefones) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefones = telefones;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String[] getTelefones() {
		return telefones;
	}
	public void setTelefones(String[] telefones) {
		this.telefones = telefones;
	}
	
}

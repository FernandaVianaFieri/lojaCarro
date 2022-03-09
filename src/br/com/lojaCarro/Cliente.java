package br.com.lojaCarro;

import java.util.Date;

public class Cliente {

	private String nome;
	private String sobrenome;
	private String cpf;
	private String telefone;
	private Date dataNascimento;
	private double desconto;
	
	 	
	public Cliente () {
		
	}
	
	
	public Cliente (String nome, String sobrenome, String cpf, Date dataNascimento, String telefone, double desconto) {
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public double getDesconto() {
		return desconto;
	}


	public void setDesconto()	{
		
	}
	
	
}

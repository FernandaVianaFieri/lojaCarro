package br.com.lojaCarro.Bo;

import java.util.Date;

import br.com.lojaCarro.Bean.Cliente;

public class ClienteBo {

	public Cliente cadastarCliente(String nome, String sobrenome, String cpf, Date dataNascimento,double desconto) {
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setSobrenome(sobrenome);
		cliente.setCpf(cpf);
		cliente.setDataNascimento(dataNascimento);
		cliente.setDesconto();

		return cliente;

	}

	
	
	
}

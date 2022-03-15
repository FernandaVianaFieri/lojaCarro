package br.com.lojaCarro;

import java.util.UUID;

public class Carro {

	// atributos do carro

	
	private Double valor;
	private String anoFabricacao;
	private String modelo;
	private String marca;
	private String idCarro;
	private String cadastar;
	private String deletar;	
	private String categoria;
	

	public Carro() {

	}

	public Carro(Double valor, String anoFabricacao, String modelo, String marca, String idCarro,String categoria) {
		super();
		this.valor = valor;
		this.anoFabricacao = anoFabricacao;
		this.modelo = modelo;
		this.marca = marca;
		this.idCarro  = UUID.randomUUID().toString();
		this.categoria = categoria;

	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	

	public String getId() {
		return idCarro;
	}

	public void setId(String id) {
		this.idCarro = id;
	}

	public String getCadastar() {
		return cadastar;
	}

	public void setCadastar(String cadastar) {
		this.cadastar = cadastar;
	}
	

	public String getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(String idCarro) {
		this.idCarro = idCarro;
	}

	public String getDeletar() {
		return deletar;
	}

	public void setDeletar(String deletar) {
		this.deletar = deletar;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String delete(Carro carro) {
		if (Carro.isEmpty()) {
			carro.delete(carro);
		}
		return deletar;
		
	}

	private static boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public void save(Carro carro) {
		// TODO Auto-generated method stub
		
	}

	
	}



	



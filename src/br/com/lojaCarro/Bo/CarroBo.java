package br.com.lojaCarro.Bo;

import java.util.HashMap;

import br.com.lojaCarro.Bean.Carro;
import br.com.lojaCarro.Bean.Categoria;



public class CarroBo {
	
	HashMap<Integer, Carro> carros;
	static int cont = 0;

	
	public CarroBo() {
		 carros = new HashMap<Integer, Carro>();
	}
		
	//Key,value
	
	public String  cadastraCarro (double valor, String anoFabricacao, String modelo, String marca, String idCarro, Categoria estadoCarro  ) {
			Carro carro = new Carro(valor, anoFabricacao, modelo, marca, idCarro, estadoCarro);		
			carros.put(cont++, carro);
			
			return "Cadastro realizado com sucesso!\n" + carro.toString(); 
	    
	
	 
	}
	
	

	public boolean apagaCarro(Carro  carro) {
		if (carro != null) {
			if (carro.getId()!=null) {
				carro.delete(carro);
			}
						
		}
		return false;
	}
	
	public boolean update(Carro carro) {
		if (carro != null) {
			if (carro.getId() != null ) {
				carro.save(carro);
				return true;
				
			} }
		return false;
	}
				
					
	/*
	public boolean vendaCarro( String idCarro) {
		if (idCarro != null) {
	return true ;
		}
		return false;*/
	
}

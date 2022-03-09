package Bo;

import java.util.HashMap;

import br.com.lojaCarro.Carro;



public class CarroBo {
	
	
	public HashMap<Integer, String> cadastraCarro (String valor, String anoFabricacao, String modelo, String marca, String idCarro,String categoria ) {
	HashMap<Integer, String> carro = new HashMap<Integer, String>();
		
		carro.put(1,valor);
		carro.put(2,anoFabricacao);
		carro.put(3,modelo);
		carro.put(4,marca);
		carro.put(5,idCarro);		
		carro.put(5, categoria);
		return carro;
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

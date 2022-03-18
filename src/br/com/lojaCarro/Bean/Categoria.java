package br.com.lojaCarro.Bean;

public enum Categoria {
	
	NOVO ("Novo"),SEMINOVO ("Seminivo");
	
		private String texto;

		private Categoria(String texto) {
			this.texto = texto;
		
		}

		public String getTexto() {
			return texto;
		}

			
		
		
}
	

	


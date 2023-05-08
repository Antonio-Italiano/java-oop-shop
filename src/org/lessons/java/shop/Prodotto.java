package org.lessons.java.shop;

public class Prodotto {

	private int codice;
	private String nome;
	private String descrizione;
	private Double prezzo;
	private int iva;
	
	
	public Prodotto(
			int codice, 
			String nome, 
			String descrizione, 
			Double prezzo, 
			int iva) {
		
		this.codice = codice;
		this.nome = nome;
		this.descrizione = descrizione; 
		this.prezzo = prezzo; 
		this.iva = iva;
	}
	
	@Override
	public String toString() {
		return 
			    " codice: " + getCodice() 
				+ "  nome: " + getNome()  
				+ "  descrizione:" + getDescrizione() 
				+ "  prezzo:" + String.format("%.2f",getPrezzo())
				+ "  iva: " + iva;
	
	}
	

	//CODICE
	public String getCodice() {
		String strCode = "" + codice;
		int strLng = strCode.length();
		
		for(int x = 0; x<8-strLng; x++) {
			strCode = "0" + strCode;
		}
		String fullCode = strCode + codice;
		return fullCode;
	}
	
	//NOME
	public String getFullNome() {
		return codice + "-" + nome;
	}
	public String getNome() {
			return nome;
	}
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	//DESCRIZIONE
	public String getDescrizione() {
		
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		
		this.descrizione = descrizione;
	}
	
	//PREZZO
	public Double getFullPrezzo() {
		return prezzo + (prezzo*iva)/ 100;
	}
	public Double getPrezzo() {
		
		return prezzo;
	}
	public void setPrezzo(Double prezzo) {
		
		this.prezzo = prezzo;
	}
	
	//IVA
	public int getIva() {
		
		return iva;
	}
	public void setIva(int iva) {
		
		this.iva = iva;
	}
	
}

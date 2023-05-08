package org.lessons.java.shop;


import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		Prodotto[] prodotti = new Prodotto[10];
		int prodottiLng = prodotti.length;
		
		Random rnd = new Random();
		for(int x = 0; x < prodottiLng; x++) {
			Prodotto s = new Prodotto(
					x + 1000,
					"Nome-prodotto " + x,
					" Descrizione casuale ",
					rnd.nextDouble(5,50),
					rnd.nextInt(4,22));
			prodotti[x] = s;
		}
		
		for(int x = 0; x < prodottiLng; x++) {
			Prodotto s = prodotti[x]; 
			System.out.println(
					s
					+ " nome-completo: " + s.getFullNome()
					+ " prezzo con iva: " + String.format("%.2f",s.getFullPrezzo())
					);
		}
	}
}

package jana60.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		
		Random rnd = new Random();
		Conto conto = new Conto(
				rnd.nextInt(1000),
				"Giuseppe",
				0.00
				);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quale operazione vuoi effettuare? 1 prelevare - 2 depositare - 3 estratto");
		int risposta = sc.nextInt();
		
		if(risposta == 1) {
			System.out.println("Hai selezionato prelevare. Inserisci la somma che desideri prelevare");
			int prelievo = sc.nextInt();
			conto.prelievo(prelievo);
			System.out.println("Saldo attuale: " + conto.getSaldo());
		} 
		if(risposta == 2) {
			System.out.println("Hai selezionato depositare. Inserisci la somma che desideri depositare");
			int deposito = sc.nextInt();
			conto.deposito(deposito);
			System.out.println("Saldo attuale: " + conto.getSaldo());
		}
		if(risposta == 3) {
			System.out.println("Hai selezionato estratto.");
			System.out.println("Saldo attuale: " + conto.getSaldo());
		}
	}
	
}

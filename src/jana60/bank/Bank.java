package jana60.bank;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A che nome aprire il conto?");
		String nameUser = sc.nextLine();
		Conto conto = new Conto(nameUser);
		
		while(true) {
			
			System.out.println("Quale operazione vuoi effettuare? 1 prelevare - 2 depositare - 3 uscire");
			int risposta = sc.nextInt();
			
			
			if(risposta < 1 || risposta > 3) {
				System.err.println("Scelta non trovata");
				continue;
			}
			
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
				System.out.println("Arrivederci");
				return;
			}		
		}
	}
	
}

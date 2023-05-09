package jana60.bank;

import java.util.Random;

public class Conto {

	private String numeroConto;
	private String nomeProprietario;
	private Double saldo;

	public Conto(String nomeProprietario) {
		
		Random rnd = new Random();
		numeroConto = "" + rnd.nextInt(1001);
		this.nomeProprietario = nomeProprietario; 
		this.saldo = 0.00; 
	}
	
	//ESTRATTO
	@Override
	public String toString() {
		return "conto: " 
				+ "numeroConto: " + numeroConto
				+ "nomeProprietario: " + nomeProprietario
				+ "saldo: " + String.format("%.2f", saldo);
	}
	
	public void deposito(int saldo) {
		if(saldo >= 1) {
			
			this.saldo += saldo;
		}
		return;
	}
	public void prelievo(int saldo) {
		if(this.saldo >= saldo) {
			
			this.saldo -= saldo;
		}
		return;
	}
	
	//NOME
	public String getNome() {
		
		return nomeProprietario;
	}
	public void setNome(String nome) {
		
		this.nomeProprietario = nome;
	}
	
	//SALDO
	public Double getSaldo() {
		
		return saldo;
	}
}



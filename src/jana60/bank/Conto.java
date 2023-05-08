package jana60.bank;

public class Conto {

	private int numeroConto;
	private String nomeProprietario;
	private Double saldo;

	public Conto(
			int numeroConto, 
			String nomeProprietario, 
			Double saldo) {
		
		this.numeroConto = numeroConto;
		this.nomeProprietario = nomeProprietario; 
		this.saldo = saldo; 
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



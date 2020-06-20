package net.oluciano.modelos;

public class Conta {

	int numero;
	double saldo;

	public Conta(int numero) {
		this.numero = numero;
	}

	private int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void saca(double valor) {
		saldo -= valor;
	}

	public void deposita(double valor) {
		saldo += valor;
	}

	@Override
	public String toString() {
		return String.format("Número: %d, Saldo: %.2f", getNumero(), getSaldo());
	}
	
	public String meuToString(){
		return String.format("Número: %d, Saldo: %.2f", getNumero(), getSaldo());
	}
	
	@Override
	public boolean equals(Object obj) {
		// Considera que se o número é o mesmo e o saldo é o mesmo, então é a mesma conta.
		return (this.getNumero() == ((Conta) obj).getNumero()) && (this.getSaldo() == ((Conta) obj).getSaldo());
	}
	
	public boolean transfere(Conta conta, double valor) {
		
		this.saca(valor);
		conta.deposita(valor);
		
		return true;
	}

}

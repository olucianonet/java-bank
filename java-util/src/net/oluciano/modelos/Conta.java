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

}

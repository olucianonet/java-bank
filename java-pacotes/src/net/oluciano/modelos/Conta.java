package net.oluciano.modelos;

import net.oluciano.exceptions.SaldoInsuficienteException;

// Classes sem modificador de acesso é visivel somente no pacote
class Conta {

	private double saldo;
	// package private
	int numero = 1;

	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(
					"Saldo: " + this.saldo + ", Saque: " + valor + ". Saldo insuficiente!");
		}

		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
}

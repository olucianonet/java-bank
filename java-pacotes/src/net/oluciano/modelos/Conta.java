package net.oluciano.modelos;
import exceptions.SaldoInsuficienteException;

public class Conta {

	private double saldo;
	
	public void deposita(double valor) {		
		this.saldo += valor;		
	}
	
	public void saca(double valor) throws SaldoInsuficienteException{		
		if (this.saldo < valor){
			throw new SaldoInsuficienteException(
					"Saldo: " + this.saldo + ", Saque: " + valor +
					". Saldo insuficiente!");
		}
		
		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
}

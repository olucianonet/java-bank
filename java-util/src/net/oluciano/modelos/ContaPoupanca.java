package net.oluciano.modelos;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numero) {
		super(numero);
	}

	@Override
	public void deposita(double valor) {
		super.deposita(valor * 1.05);
	}
	
}

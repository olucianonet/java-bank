package net.oluciano.modelos;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero) {
		super(numero);
	}

	@Override
	public void saca(double valor) {
		super.saca(valor * 1.01);
	}

}

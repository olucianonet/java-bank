package conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int conta, Cliente cliente) {
		super(agencia, conta, cliente);
	}

	@Override
	public void deposita(double valor) {

		super.saldo += valor;
	}

}

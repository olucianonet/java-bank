package conta;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int conta, Cliente cliente) {
		super(agencia, conta, cliente);
	}	
	
	@Override
	public boolean saca(double valor) {
		// Não existe um sava explicito nesse classe.
		// Mesmo assim, quando chamado o transfere, 
		// o metodo executado sera da classe ContaCorrente
		valor += 0.02;		
		return super.saca(valor);
	}

	@Override
	public void deposita(double valor) {
		
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return this.saldo * 0.1;
	}
}

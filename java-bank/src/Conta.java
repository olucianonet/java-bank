
public class Conta {
	
	int agencia;
	int conta;
	String titular;
	double saldo;
	

	public void deposita(double valor){
		
		this.saldo += valor;
	}
	
	public boolean saca(double valor){
		
		boolean sucesso = valor <= this.saldo;
		
		if (sucesso){			
			this.saldo -= valor;
		}
		
		return sucesso;
	}
	
	public boolean transfere(Conta outraConta, double valor){
		
		boolean sucesso = this.saca(valor);
		
		if (sucesso)
			outraConta.deposita(valor);
		
		return sucesso;
		
	}	
}

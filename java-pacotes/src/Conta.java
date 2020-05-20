
public class Conta {

	double saldo;
	
	void deposita(double valor) {		
		this.saldo += valor;		
	}
	
	void saca(double valor) throws SaldoInsuficienteException{		
		if (this.saldo < valor){
			throw new SaldoInsuficienteException(
					"Saldo: " + this.saldo + ", Saque: " + valor +
					". Saldo insuficiente!");
		}
		
		this.saldo -= valor;
	}
}
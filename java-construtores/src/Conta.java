
public class Conta {

	private int agencia;
	private int conta;
	private Cliente titular;
	private double saldo;
	
	private static int totalDeContas = 0;
	
	public Conta(){
		// Chamando o construtor com args.
		this(1, 1, new Cliente());
	}	

	public Conta(int agencia, int conta, Cliente cliente) {
		
		this.agencia = agencia;
		this.conta = conta;
		this.titular = cliente;
		
		Conta.totalDeContas++;
	}
	
	public void deposita(double valor) {

		this.saldo += valor;
	}

	public boolean saca(double valor) {

		boolean sucesso = valor <= this.saldo;

		if (sucesso) {
			this.saldo -= valor;
		}

		return sucesso;
	}

	public boolean transfere(Conta outraConta, double valor) {

		boolean sucesso = this.saca(valor);

		if (sucesso)
			outraConta.deposita(valor);

		return sucesso;

	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public void setTitular(Cliente cliente) {
		this.titular = cliente;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
}

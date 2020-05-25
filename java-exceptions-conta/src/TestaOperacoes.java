
public class TestaOperacoes {

	public static void main(String[] args) {

		Conta c = new Conta();
		c.deposita(100.0);
		System.out.println("Saldo: " + c.saldo);
		
		try {
			System.out.println("Realizando um saque..");
			c.saca(150);
			System.out.println("Operação realizada!");
			
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Saldo: " + c.saldo);
		System.out.println("Fim da operação!");
		
	}

}

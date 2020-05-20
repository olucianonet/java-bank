package net.oluciano.testes;
import net.oluciano.exceptions.SaldoInsuficienteException;
import net.oluciano.modelos.herdada.ContaHerdada;

public class TestaOperacoes {

	public static void main(String[] args) {

		ContaHerdada c = new ContaHerdada();
		c.deposita(100.0);
		System.out.println("Saldo: " + c.getSaldo());
		
		try {
			System.out.println("Realizando um saque..");
			c.saca(150);
			System.out.println("Operação realizada!");
			
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Saldo: " + c.getSaldo());
		System.out.println("Fim da operação!");
		
	}

}

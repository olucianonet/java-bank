package net.oluciano.testes;

import net.oluciano.modelos.Conta;
import net.oluciano.modelos.ContaCorrente;
import net.oluciano.util.GuardadorDeContas;

public class TestaGuardadorDeContas {

	public static void main(String[] args) {

		GuardadorDeContas gdc = new GuardadorDeContas();

		Conta c1 = new ContaCorrente(1);
		c1.deposita(100.0);

		Conta c2 = new ContaCorrente(2);
		c2.deposita(200.0);

		Conta c3 = new ContaCorrente(3);
		c3.deposita(300.0);

		gdc.adicionarConta(c1);
		gdc.adicionarConta(c2);
		gdc.adicionarConta(c3);
		
		for (int i = 0; i < gdc.getQuantidadeDeContas(); i++) {
			System.out.println(gdc.getConta(i));
		}
		
	}

}

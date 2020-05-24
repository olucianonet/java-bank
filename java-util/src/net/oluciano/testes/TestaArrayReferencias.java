package net.oluciano.testes;

import net.oluciano.modelos.Conta;
import net.oluciano.modelos.ContaCorrente;
import net.oluciano.modelos.ContaPoupanca;

public class TestaArrayReferencias {

	public static void main(String[] args) {

		Conta[] contas = new Conta[3];
		contas[0] = new ContaCorrente(1);
		contas[1] = new ContaPoupanca(2);
		contas[2] = new ContaCorrente(3);
		
		contas[0].deposita(100.0);
		contas[1].deposita(200.0);
		contas[2].deposita(130.0);
		
		for (int i = 0; i < contas.length; i++) {
			System.out.println(contas[i]);
		}

		// Apesar do objeto apontado ser do tipo ContaCorrente
		// A variável não é, por isso é preciso forçar o cast.
		ContaCorrente cc = (ContaCorrente) contas[0];

		System.out.println(cc);
	}

}

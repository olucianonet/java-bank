package net.oluciano.testes;

import net.oluciano.modelos.Conta;
import net.oluciano.modelos.ContaCorrente;
import net.oluciano.modelos.ContaPoupanca;

public class TestaTransfere {

	public static void main(String[] args) {
		
		Conta cp = new ContaPoupanca(1);
		Conta cc = new ContaCorrente(2);
		
		cp.deposita(100);
		cc.deposita(100);
		
		System.out.println(cc);
		System.out.println(cp);

		cc.transfere(cp, 10);
		
		System.out.println(cc);
		System.out.println(cp);
		
		
	}

}

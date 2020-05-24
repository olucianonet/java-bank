package net.oluciano.testes;

import net.oluciano.modelos.Conta;
import net.oluciano.modelos.ContaCorrente;
import net.oluciano.modelos.ContaPoupanca;
import net.oluciano.util.GuardadorDeObjects;

public class TestaGuardadorDeObjects {

	public static void main(String[] args) {

		GuardadorDeObjects gdo = new GuardadorDeObjects();
		Conta c1 = new ContaCorrente(1);
		c1.deposita(199.0);
		String s1 = "Java";
		Conta c2 = new ContaPoupanca(2);
		c2.deposita(299.0);
		
		gdo.adicionarObjeto(c1);
		gdo.adicionarObjeto(s1);
		gdo.adicionarObjeto(c2);
		
		for (int i = 0; i < gdo.getQuantidadeDeObjetos(); i++) {
			System.out.println(gdo.getObjeto(i));
		}		
		
		
	}

}

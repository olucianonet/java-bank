package net.oluciano.testes;

import java.util.ArrayList;

import net.oluciano.modelos.Conta;
import net.oluciano.modelos.ContaCorrente;
import net.oluciano.modelos.ContaPoupanca;

public class TestaArrayListComGenerics {

	public static void main(String[] args) {

		ArrayList<Conta> al = new ArrayList<Conta>();
		
		Conta c1 = new ContaCorrente(1);
		c1.deposita(199.0);
		String s1 = "Java";
		Conta c2 = new ContaPoupanca(2);
		c2.deposita(299.0);
		
		al.add(c1);
		// al.add(s1); Não compila, pois foi utilizado Generics
		al.add(c2);
		
		// utilizando o enhanced for
		for (Conta conta : al) {
			System.out.println(conta.meuToString());
		}		
		
	}

}

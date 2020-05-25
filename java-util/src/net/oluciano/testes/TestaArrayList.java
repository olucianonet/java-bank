package net.oluciano.testes;

import java.util.ArrayList;

import net.oluciano.modelos.Conta;
import net.oluciano.modelos.ContaCorrente;
import net.oluciano.modelos.ContaPoupanca;

public class TestaArrayList {

	public static void main(String[] args) {

		// Utilizando arraylist
		ArrayList al = new ArrayList();
		
		Conta c1 = new ContaCorrente(1);
		c1.deposita(199.0);
		String s1 = "Java";
		Conta c2 = new ContaPoupanca(2);
		c2.deposita(299.0);
		
		al.add(c1);
		al.add(s1);
		al.add(c2);
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}	
		
	}

}

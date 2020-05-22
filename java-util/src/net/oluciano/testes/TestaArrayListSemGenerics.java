package net.oluciano.testes;

import java.util.ArrayList;

import net.oluciano.modelos.Conta;
import net.oluciano.modelos.ContaCorrente;
import net.oluciano.modelos.ContaPoupanca;

public class TestaArrayListSemGenerics {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		Conta c1 = new ContaCorrente(1);
		c1.deposita(199.0);
		String s1 = "Java";
		Conta c2 = new ContaPoupanca(2);
		c2.deposita(299.0);
		
		al.add(c1);
		al.add(s1);
		al.add(c2);
		
		// Permite o cast para String, 
		// porém é uma Conta
		// String s2 = (String) al.get(0);
		// al.get(0).meuToString(); Não compila, precisaria do cast
		Conta c3 = (Conta) al.get(0);
		System.out.println(c3.meuToString());
		
		
	}

}

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
		Conta c2 = new ContaPoupanca(2);
		c2.deposita(299.0);
		Conta c3 = new ContaPoupanca(3);
		c3.deposita(99.0);
		// Cria outra conta com os mesmos atributos
		Conta c4 = new ContaPoupanca(3);
		c4.deposita(99.0);
		Conta c5 = new ContaPoupanca(5);
		c5.deposita(99.0);
		
		
		al.add(c1);
		al.add(c2);
//		al.add(c3);
		al.add(c4);
		
		if (al.contains(c3)){
			System.out.println("Conta localizada: " + c3);
		}
		
		if (al.contains(c5)){
			System.out.println("Conta localizada: " + c5);
		}

		
		
//		for (Conta conta : al) {
//			 
//			System.out.println(conta.meuToString());
//		}		
		
	}

}

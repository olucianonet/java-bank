package net.oluciano.testes;

import net.oluciano.modelos.ContaBind;
import net.oluciano.modelos.especial.ContaEspecial;
import net.oluciano.modelos.herdada.ContaHerdada;

public class TestaContas {

	public static void main(String[] args) {

		ContaEspecial ce = new ContaEspecial();
		ContaHerdada ch = new ContaHerdada();
		ContaBind cb = new ContaBind();
		// Conta c = new Conta(); Package private
		
		System.out.println(ce.verificaNumero());
		System.out.println(ch.getSuperNumero());
		System.out.println(ch.getThisNumero());
		
	}

}

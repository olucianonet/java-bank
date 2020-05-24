package net.oluciano.testes;

import net.oluciano.modelos.ContaBind;

public class TestaContaBindObject {

	public static void main(String[] args) {

		ContaBind cb = new ContaBind();
		cb.deposita(1000.0);
		
		System.out.println(cb);
	}

}

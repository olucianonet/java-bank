package net.oluciano.testes;

import java.util.Arrays;
import java.util.List;

public class TestaArraysAsList {

	public static void main(String[] args) {

		// Usei a classe Integer
		Integer[] numeros = new Integer[3];
		numeros[0] = 0;
		numeros[1] = 1;
		numeros[2] = 2;
		
		// Pois na conversão, List não aceita primitivos
		List<Integer> inteiros = Arrays.asList(numeros);
		System.out.println(inteiros);
		
		
	}

}

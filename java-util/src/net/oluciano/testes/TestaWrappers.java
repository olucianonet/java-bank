package net.oluciano.testes;

import java.util.ArrayList;
import java.util.List;

public class TestaWrappers {

	public static void main(String[] args) {
		
		/*
		 * Wrapper são classes que encapsulam tipos primitivos
		 * 
		 * Abaixo estou testando o un/auto/boxing
		 * 
		 */

		Integer dez = 10;		
		System.out.println(dez);
		
		// para cada primitivo existe uma classe chamada Wrapper
		int vinte = new Integer("20");
		double dezPontoCinco = new Double(10.5);
		System.out.println(vinte);

	    // para guardar um primitivo numa coleção é preciso criar um objeto que embrulha o valor
		List<Integer> inteiros = new ArrayList();
		inteiros.add(5); // a criação do objeto Wrapper é chamada de autoboxing automático
		
		String trinta = new Integer("30").toString();
		System.out.println(trinta);
		
		// a retirada do valor primitivo do objeto Wrapper é chamada de unboxing
		System.out.println(dez.intValue());
		
		// autoboxing e unboxing acontecem automaticamente.
		// as classes wrapper possuem vários métodos auxiliares, por exemplo para o parsing
		int quarenta = Integer.parseInt("40");
		System.out.println(quarenta);		
		System.out.println(Integer.compare(2, 4));
		System.out.println(Integer.sum(3, 3));
		Integer.reverse(10);
		
		// todas as classes wrappers que representam um valor numérico possuem a classe java.lang.Number como mãe
		Number number = new Integer(10);
		System.out.println(number);

	}

}

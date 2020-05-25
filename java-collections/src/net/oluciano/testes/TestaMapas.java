package net.oluciano.testes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import net.oluciano.modelos.Pessoa;

public class TestaMapas {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Joao", 30);		
		Pessoa p2 = new Pessoa("Catia", 25);
		Pessoa p3 = new Pessoa("Romeu", 35);
		
		Map<String, Pessoa> pessoas = new HashMap<>();
		pessoas.put("Java", p1);
		pessoas.put("Python", p2);
		pessoas.put("Git", p3);

		Set<String> keys = pessoas.keySet();

//		Deprecated
//		for (String key : keys) {
//			System.out.printf("Curso: %s, Pessoa: %s%n", key, pessoas.get(key));
//		}
		
		// Java 1.8
		pessoas.keySet().forEach(curso -> {System.out.println(pessoas.get(curso));});
	}

}

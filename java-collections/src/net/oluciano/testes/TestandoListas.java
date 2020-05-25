package net.oluciano.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestandoListas {

	public static void main(String[] args) {

		// Adicionando valores no construtor
		List<String> cursos = new ArrayList<String>(Arrays.asList("Java", "Git", "HTML"));
		
		// Adicionando valores com add.
		cursos.add("Android");

		imprime(cursos);
		
		// Removendo elementos
		System.out.print("\nRemovendo o item 1");
		String cursoRemovido = cursos.remove(1);		
		
		imprime(cursos);
		
		System.out.println("\nCurso removido: " + cursoRemovido);
		
		// Recuperando um elemento
		System.out.print("\nRecuperando elemento 2: " + cursos.get(2));
		
		System.out.print("\nOrdenando a lista baseado no nome do curso");
		
		cursos.sort(null);
		// Outra forma de ordenar é passar a lista para Collections
		// Collections.sort(cursos)		
		imprime(cursos);
		
	}
	
	public static void imprime(List<String> lista){
		
		System.out.println();
		
		for (String item : lista) {
			System.out.printf("%s ", item);
		}
	}
}

package net.oluciano.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import net.oluciano.modelos.Aluno;

public class TestaOrdenacaoDeCollections {

	public static void main(String[] args) {

		/*
		 * para ordenar uma lista é preciso definir um critério de ordenação
		 * há duas formas de definir esse critério
		 * 	pela interface Comparator
		 * 	pela interface Comparable (ordem natural)
		 * o algoritmo de ordenação já foi implementado
		 * na lista no método sort
		 * 
		 * a classe Collections é uma fachada com vários métodos auxiliares para trabalhar com as coleções, principalmente listas
		 */
		
		Aluno a1 = new Aluno(1, "Luciano", "123", 30);
		Aluno a2 = new Aluno(2, "João", "124", 20);
		Aluno a3 = new Aluno(3, "Maria", "125", 18);
		Aluno a4 = new Aluno(4, "Beatriz", "122", 40);
		
		List<Aluno> classe = new ArrayList<Aluno>();
		classe.add(a1);
		classe.add(a2);
		classe.add(a3);
		classe.add(a4);		
		
		IdadeComparator mc = new IdadeComparator();
		// na classe Collections pelo método sort
		Collections.sort(classe, mc);
		
		for (Aluno aluno : classe) {
			System.out.println(aluno);
		}
		
	}

}

class IdadeComparator implements Comparator<Aluno> {

	@Override
	public int compare(Aluno aluno1, Aluno aluno2) {
		return Integer.compare(aluno1.getIdade(), aluno2.getIdade());
	}	
}
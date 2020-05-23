package net.oluciano.testes;

import java.util.ArrayList;
import java.util.List;

import net.oluciano.modelos.Aluno;

public class TestaOrdemNatural {

	public static void main(String[] args) {

		Aluno a1 = new Aluno(1, "Luciano", "123", 30);
		Aluno a2 = new Aluno(2, "João", "124", 20);
		Aluno a3 = new Aluno(3, "Maria", "125", 18);
		Aluno a4 = new Aluno(4, "Beatriz", "122", 40);
		
		List<Aluno> classe = new ArrayList<Aluno>();
		classe.add(a1);
		classe.add(a4);	
		classe.add(a2);
		classe.add(a3);
		
		for (Aluno aluno : classe) {
			System.out.println(aluno);
		}
		
		classe.sort(null);
		
		System.out.println();
		
		for (Aluno aluno : classe) {
			System.out.println(aluno);
		}
		
		
	}

}

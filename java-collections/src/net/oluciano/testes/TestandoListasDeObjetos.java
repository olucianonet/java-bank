package net.oluciano.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import net.oluciano.modelos.Aluno;

public class TestandoListasDeObjetos {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Joao", "Ramos", 20, 1.80, "Java");
		Aluno a2 = new Aluno("Beatriz", "Souza", 25, 1.70, "Python");
		Aluno a3 = new Aluno("Carla", "Menezes", 22, 1.65, "Git");
		Aluno a4 = new Aluno("Beatriz", "Benedito", 21, 1.80, "Android");
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);

		imprime(alunos);

		Collections.sort(alunos);

		imprime(alunos);

		// Ordenando com Java 8
		alunos.sort(Comparator.comparing(Aluno::getIdade));
		imprime(alunos);

	}

	public static void imprime(List<Aluno> lista){
		
		System.out.println();
		
		for (Aluno item : lista) {
			System.out.printf("%s%n", item);
			
		}
	}	
}

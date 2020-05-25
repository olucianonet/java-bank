package net.oluciano.testes;

import java.util.ArrayList;
import java.util.List;

import net.oluciano.modelos.Aluno;
import net.oluciano.modelos.Grupo;

public class TestaGrupo {

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
		
		Grupo g1 = new Grupo("Java", alunos, a2);
		
		System.out.println(g1);
		
		// Adicionando novo integrando ao grupo.
		Aluno a5 = new Aluno("Tiago", "Francisco", 30, 1.70, "C");
		g1.adicionaAluno(a5);		
		
		System.out.println();
		System.out.println(g1);
		
		List<Aluno> alunosSomenteLeitura = g1.getAlunos();
		
		for (Aluno aluno : alunosSomenteLeitura) {
			System.out.println(aluno);
		}
		
	}

}

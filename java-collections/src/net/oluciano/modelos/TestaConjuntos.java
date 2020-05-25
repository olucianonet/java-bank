package net.oluciano.modelos;

import java.util.HashSet;
import java.util.Set;

public class TestaConjuntos {

	public static void main(String[] args) {
		
		AlunoComCPF a1 = new AlunoComCPF("Joao", "Ramos", 20, 1.80, "Java", "123");
		AlunoComCPF a2 = new AlunoComCPF("Beatriz", "Souza", 25, 1.70, "Python", "231");
		AlunoComCPF a3 = new AlunoComCPF("Carla", "Menezes", 22, 1.65, "Git", "213");
		AlunoComCPF a4 = new AlunoComCPF("Beatriz", "Benedito", 21, 1.80, "Android", "132");
		AlunoComCPF a5 = new AlunoComCPF("Carla", "Menezes", 22, 1.65, "Git", "213");		
		
		Set<AlunoComCPF> alunos = new HashSet<>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a5);

		for (AlunoComCPF aluno : alunos) {
			System.out.println(aluno);
		}
	}
}

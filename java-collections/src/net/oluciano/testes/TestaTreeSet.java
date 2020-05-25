package net.oluciano.testes;

import java.util.Set;
import java.util.TreeSet;

import net.oluciano.modelos.AlunoComCPF;

public class TestaTreeSet {

	public static void main(String[] args) {

		AlunoComCPF a1 = new AlunoComCPF("Joao", "Ramos", 20, 1.80, "Java", "123");
		AlunoComCPF a2 = new AlunoComCPF("Beatriz", "Souza", 25, 1.70, "Python", "231");
		AlunoComCPF a3 = new AlunoComCPF("Carla", "Menezes", 22, 1.65, "Git", "213");
		AlunoComCPF a4 = new AlunoComCPF("Beatriz", "Benedito", 21, 1.80, "Android", "132");
		
		// para adiconarmos um objeto em treeset ele precisa 
		// implementar comparable
		Set alunos = new TreeSet();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
	}

}

package net.oluciano.testes;

import java.util.HashSet;
import java.util.Set;

import net.oluciano.modelos.AlunoComCPF;
import net.oluciano.modelos.GrupoComSet;

public class TestaGrupoComSet {

	public static void main(String[] args) {
		AlunoComCPF a1 = new AlunoComCPF("Joao", "Ramos", 20, 1.80, "Java", "123");
		AlunoComCPF a2 = new AlunoComCPF("Beatriz", "Souza", 25, 1.70, "Python", "231");
		AlunoComCPF a3 = new AlunoComCPF("Carla", "Menezes", 22, 1.65, "Git", "213");
		AlunoComCPF a4 = new AlunoComCPF("Beatriz", "Benedito", 21, 1.80, "Android", "132");
		AlunoComCPF a5 = new AlunoComCPF("Luciano", "Cunha", 39, "289", "Git");		
		// AlunoComCPF a6 = new AlunoComCPF(null, "Cunha", 39, "289", "Git");
		
		Set<AlunoComCPF> alunos = new HashSet<>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		

		GrupoComSet gcs = new GrupoComSet("Java SE 8 Programemr", alunos, a5);
		
		System.out.println(gcs);
		
		gcs.adicionaAluno(a4);
		gcs.adicionaAluno(a4);
		gcs.adicionaAluno(a4);
		
		System.out.println();
		System.out.println(gcs);
		
		System.out.println();
		System.out.println("O aluno " + a4 + " já está no grupo?: " + gcs.getAlunos().contains(a4));
	}

}

package net.oluciano.testes;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import net.oluciano.modelos.AlunoComCPF;

public class TestaComparatorComTreeSet {

	public static void main(String[] args) {

		Set<AlunoComCPF> alunos = new TreeSet<>(new OrdenaPorCurso());
		
		AlunoComCPF a1 = new AlunoComCPF("Joao", "Ramos", 20, 1.80, "Java", "123");
		AlunoComCPF a2 = new AlunoComCPF("Beatriz", "Souza", 25, 1.70, "Python", "231");
		AlunoComCPF a3 = new AlunoComCPF("Carla", "Menezes", 22, 1.65, "Git", "213");
		AlunoComCPF a4 = new AlunoComCPF("Beatriz", "Benedito", 21, 1.80, "Android", "132");
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		
		Iterator<AlunoComCPF> it = alunos.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}		
	}	
}


class OrdenaPorCurso implements Comparator<AlunoComCPF> {

	@Override
	public int compare(AlunoComCPF aluno1, AlunoComCPF aluno2) {
		return aluno1.getCurso().compareTo(aluno2.getCurso());
	}	
}
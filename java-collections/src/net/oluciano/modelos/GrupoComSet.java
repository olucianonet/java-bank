package net.oluciano.modelos;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Classe que representa um grupo de estudos
 */
public class GrupoComSet {

	private String tema;
	private Set<AlunoComCPF> alunos = new HashSet<AlunoComCPF>();
	private AlunoComCPF representante;
	
	public GrupoComSet(String tema, Set alunos, AlunoComCPF representante) {
		super();
		this.tema = tema;
		this.alunos = alunos;
		this.representante = representante;
	}
	
	@Override
	public String toString() {
		return String.format("Tema: %s,%nAlunos: %s,%nRepresentante: %s", 
				tema, getNomesDeAlunos(), representante.getNomeCompleto());
	}

	private CharSequence getNomesDeAlunos() {
		StringBuilder alunosStr = new StringBuilder();
		
		for (AlunoComCPF aluno : alunos) {
			alunosStr.append(aluno.getNomeCompleto().concat(", "));
		};
		
		// Retorna a string menos dois caracteres finais.
		return alunosStr.substring(0, alunosStr.length() - 2);
	}

	public void adicionaAluno(AlunoComCPF aluno) {
		this.alunos.add(aluno);		
	}

	public Set<AlunoComCPF> getAlunos() {
		return Collections.unmodifiableSet(this.alunos);
	}
	
	public int getSomaIdades(){

		return this.alunos.stream().mapToInt(AlunoComCPF::getIdade).sum();
		
	}
	
}

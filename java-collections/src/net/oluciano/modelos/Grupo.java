package net.oluciano.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * Classe que representa um grupo de estudos
 */
public class Grupo {

	private String tema;
	private List<Aluno> alunos = new LinkedList<Aluno>();
	private Aluno representante;
	
	public Grupo(String tema, List alunos, Aluno representante) {
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
		
		for (Aluno aluno : alunos) {
			alunosStr.append(aluno.getNomeCompleto().concat(", "));
		};
		
		// Retorna a string menos dois caracteres finais.
		return alunosStr.substring(0, alunosStr.length() - 2);
	}

	public void adicionaAluno(Aluno aluno) {
		this.alunos.add(aluno);		
	}

	public List<Aluno> getAlunos() {
		return Collections.unmodifiableList(this.alunos);
	}
	
	public int getSomaIdades(){
//		int somaDasIdades = 0;
//				
//		for (Aluno aluno : alunos) {
//				somaDasIdades += aluno.getIdade();	
//		}
		
		return this.alunos.stream().mapToInt(Aluno::getIdade).sum();
		
//		return somaDasIdades;
	}
	
}

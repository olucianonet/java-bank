package net.oluciano.testes;

import java.util.HashMap;
import java.util.Map;

import net.oluciano.modelos.Aluno;
import net.oluciano.modelos.Pessoa;

public class TestaAlunoMatriculado {

	public static void main(String[] args) {

		Map<Integer, Pessoa> alunosMatriculados = new HashMap<Integer, Pessoa>();
		
		Pessoa joao = new Pessoa("Joao", 30);		
		Pessoa catia = new Pessoa("Catia", 25);
		Pessoa romeu = new Pessoa("Romeu", 35);		
		
		GrupoComMap gcm = new GrupoComMap();
		gcm.matriculaAluno(1, joao);
		gcm.matriculaAluno(2, catia);
		gcm.matriculaAluno(3, romeu);
		
		System.out.println(gcm.buscaAlunoMatriculado(1));		

		//TODO: Verificar 3 coleções que compõem um Map
	}

}

class GrupoComMap {
	Map<Integer, Pessoa> alunos;
	
	public GrupoComMap() {
		alunos = new HashMap<>();
	}
	
	void matriculaAluno(Integer matricula, Pessoa aluno) {
		this.alunos.put(matricula, aluno);
	}
	
	Pessoa buscaAlunoMatriculado(Integer matricula){
		return alunos.get(matricula);
	}	
}

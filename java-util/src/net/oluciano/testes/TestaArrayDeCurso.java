package net.oluciano.testes;

import net.oluciano.modelos.Curso;

public class TestaArrayDeCurso {

	public static void main(String[] args) {

		Curso[] cursos1 = new Curso[3];
		
		cursos1[0] = new Curso("Java", 8);
		cursos1[1] = new Curso("Python", 6);
		cursos1[2] = new Curso("HTML", 4);
		
		for (int i = 0; i < cursos1.length; i++) {
			System.out.println(cursos1[i].getNome());
		}
		
		// Forma literal.
		Curso[] cursos2 = {
				new Curso("Java", 3), 
				new Curso("Python", 2),
				new Curso("HTML", 1)
				}; 
		
		
		
		
	}

}

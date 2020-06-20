package net.oluciano.testes;

public class TestaString {

	public static void main(String[] args) {
		// https://cursos.alura.com.br/forum/topico-criando-outra-string-115100
		
		StringBuilder sb = new StringBuilder("Joh");
		
		sb.append('n');
		
		String nome = "Joan";
		System.out.println(nome.equals(nome.replace('a', 'h')));
		
		
//		nome = nome.replace('a', 'h');
//		
//		System.out.println(nome);
		
		
		
	}

}

package net.oluciano.testes;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Luciano";
		String outroNome = new String("Java");
		System.out.println(outroNome);
		
		String novoNome = outroNome.replace('J', 'j');
		System.out.println(outroNome);
		System.out.println(novoNome);
		
		System.out.println(nome.toLowerCase());
		System.out.println(nome.toUpperCase());
		
		System.out.println(nome.charAt(5));
		System.out.println(outroNome.indexOf('a'));
		
		System.out.println(nome.length());
		// isEmpty, trim, contains, split
		System.out.println(nome.isEmpty());
		String vazio = "";
		System.out.println(vazio.isEmpty());
		vazio = "    palavra";
		System.out.println(vazio);
		System.out.println("antes do trim: " + vazio.length());
		System.out.println("depois do trim: " + vazio.trim() + ", " + vazio.trim().length());
		System.out.println(vazio);
	}

}

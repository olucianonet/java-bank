package net.oluciano.modelos;

public class Conexao {

	public Conexao() {
		System.out.println("Abrindo conexão");
	}
	
	public void leDados(boolean illegalArg) {

		if (illegalArg)
			throw new IllegalArgumentException("Argumento ilegal recebido!");
			
		System.out.println("Recebendo dados");
	}
	
	public void fecha() {
		System.out.println("Fechando conexão");
	}
	
}

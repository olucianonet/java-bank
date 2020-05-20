
public class Conexao {

	public Conexao() {
		System.out.println("Abrindo conexão");
	}
	
	void leDados(boolean illegalArg) {

		if (illegalArg)
			throw new IllegalArgumentException("Argumento ilegal recebido!");
			
		System.out.println("Recebendo dados");
	}
	
	void fecha() {
		System.out.println("Fechando conexão");
	}
	
}

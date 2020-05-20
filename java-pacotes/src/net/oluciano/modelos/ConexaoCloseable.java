package net.oluciano.modelos;

public class ConexaoCloseable  implements AutoCloseable{

	public ConexaoCloseable() {
		System.out.println("Abrindo conexão");
	}
	
	public void leDados(boolean illegalArg) {

		if (illegalArg)
			throw new IllegalArgumentException("Argumento ilegal recebido!");
			
		System.out.println("Recebendo dados");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Fechando conexão");		
	}	
	
}

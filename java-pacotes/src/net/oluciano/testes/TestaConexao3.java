package net.oluciano.testes;
import net.oluciano.modelos.ConexaoCloseable;

public class TestaConexao3  {

	public static void main(String[] args) {
		
		// não é necessário fechar a conexão,
		// já que a classe já implementa esse método.
		try (ConexaoCloseable c = new ConexaoCloseable();){
			boolean illegalArg = true;
			c.leDados(illegalArg);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}

}

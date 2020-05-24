
public class TestaConexao {

	public static void main(String[] args) {
		
		Conexao c = null;
		
		try {
			c = new Conexao();
			c.leDados(true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// Inserindo o fecha no finally 
			// para garantir fechamento da con.
			c.fecha();			
		}
	
	}

}

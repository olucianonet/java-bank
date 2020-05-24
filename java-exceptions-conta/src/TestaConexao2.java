
public class TestaConexao2 {

	public static void main(String[] args) {
		
		try {			
			Conexao c = new Conexao();
			c.leDados(true);
			// Em razão da ex, fecha não é executado.
			c.fecha();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	
	}

}

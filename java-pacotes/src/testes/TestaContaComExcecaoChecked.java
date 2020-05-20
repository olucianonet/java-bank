package testes;
import net.oluciano.modelos.Conta;

public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

		Conta c = new Conta();

		try {

			c.deposita(1000.0);

		// Catch generico
		} catch (Exception e) {

			e.getMessage();

		}
	}
}

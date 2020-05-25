
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

		Conta c = new Conta();

		try {

			c.deposita();

		// Catch generico
		} catch (Exception e) {

			e.getMessage();

		}
	}
}

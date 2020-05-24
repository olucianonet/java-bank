
public class TestaContaComExcecaoGenerica {

	public static void main(String[] args) {

		Conta c = new Conta();

		try {

			c.deposita(1000.0);

		} catch (Exception e) {

			e.getMessage();

		}
	}
}

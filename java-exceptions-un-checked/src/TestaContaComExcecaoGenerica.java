
public class TestaContaComExcecaoGenerica {

	public static void main(String[] args) {

		Conta c = new Conta();

		try {

			c.deposita();

		} catch (MinhaExcecao e) {

			e.getMessage();

		}
	}
}

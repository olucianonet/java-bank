package net.oluciano.testes;
import net.oluciano.modelos.herdada.ContaHerdada;

public class TestaContaComExcecaoGenerica {

	public static void main(String[] args) {

		ContaHerdada c = new ContaHerdada();

		try {

			c.deposita(1000.0);

		} catch (Exception e) {

			e.getMessage();

		}
	}
}

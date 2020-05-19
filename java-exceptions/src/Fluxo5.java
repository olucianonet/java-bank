
public class Fluxo5 {

	public static void main(String[] args) {

		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		// Nesse exemplo, estamos utilizando o catch
		// porem informando o tipo de exceção errado.
		// 
		try {			
			metodo2();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim do metodo1");

	}

	private static void metodo2() {
		// Ilustrando a pilha de execução.
		System.out.println("Ini do metodo2");
		for (int i = 0; i <= 5; i++) {
			System.out.printf("%d ", i);
			Conta c = null;
			c.deposita();
		}
		System.out.println("Fim do metodo2");
	}

}


public class Fluxo {

	public static void main(String[] args) {

		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");

	}

	private static void metodo2() {
		// Ilustrando a pilha de execução.
		System.out.println("Ini do metodo2");
		for (int i = 0; i <= 5; i++) {
			System.out.printf("%d ", i);
			try {
				// Com o try/catch ocorreram exceções mas
				// o fluxo não foi interrompido.
				int a = i / 0;
			} catch (ArithmeticException ex) {
				System.out.println(ex.getMessage());
			}
		}
		System.out.println("Fim do metodo2");
	}

}

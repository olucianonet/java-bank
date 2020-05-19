
public class Fluxo2 {

	public static void main(String[] args) {

		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		// Nesse caso o método 2 não é finalizado
		// Já que o catch está controlando o fluxo do
		// método 1.
		try {			
			metodo2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim do metodo1");

	}

	private static void metodo2() {
		// Ilustrando a pilha de execução.
		System.out.println("Ini do metodo2");
		for (int i = 0; i <= 5; i++) {
			System.out.printf("%d ", i);
				int a = i / 0;
		}
		System.out.println("Fim do metodo2");
	}

}

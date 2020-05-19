
public class Fluxo3 {

	public static void main(String[] args) {

		System.out.println("Ini do main");
		// Nesse exemplo o método1 não termina,
		// pq apesar da exceção ocorrer no metodo2
		// o fluxo todo é interrompido.
		try {
			metodo1();			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// Imprimindo o rastro da pilha
			e.printStackTrace();
		}
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
				int a = i / 0;
		}
		System.out.println("Fim do metodo2");
	}

}

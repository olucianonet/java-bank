
public class Fluxo8 {

	public static void main(String[] args) {

		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		try {			
			metodo2();
			// Nesse caso, mesmo tratando a pilha estoura.
			// Pois com a recursão infinita tomamos um erro.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim do metodo1");

	}

	private static void metodo2() {		
		metodo2();
	}

}

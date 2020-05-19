
public class FluxoComTratamento {

	public static void main(String[] args) {

		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");

		try {			
			metodo2();

		} catch (ArithmeticException | NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim do metodo1");

	}

	private static void metodo2() {

		System.out.println("Ini do metodo2");
		ArithmeticException ae = new ArithmeticException("Lançando uma exception");
		throw ae;
		// Variação: new ArithmeticException();
//		System.out.println("Fim do metodo2");
	}

}

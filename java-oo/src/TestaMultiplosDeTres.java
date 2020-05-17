
public class TestaMultiplosDeTres {

	public static void main(String[] args) {

		for (int numero = 1; numero <= 100; numero++) {

			if (numero % 3 == 0)
				System.out.printf(" %3d", numero);

			if (numero % 30 == 0 && numero != 0)
				System.out.println();

		}
	}
}

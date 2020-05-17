
public class TestaFatorial {

	public static void main(String[] args) {
		
		int fatorial = 1;		
		System.out.printf("Fatorial de %2d é %11s %7d%n", 0, "=", 1);
		
		for (int numero = 1; numero <= 10; numero++) {
			
			fatorial *= numero;			
			System.out.printf("Fatorial de %2d é (%d!) * %2d = %7d%n", numero, numero - 1, numero, fatorial);

		}
	}
}

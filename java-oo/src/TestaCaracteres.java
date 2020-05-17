
public class TestaCaracteres {
	public static void main(String[] args) {

		char letra = 'L';		
		System.out.println("Letra: " + letra);

		char codigo = 100;		
		System.out.println("Código: " + codigo);

		// codigo = (codigo + 1); não compila, o valor é convertido para int.
		codigo = (char) (codigo + 1);		
		System.out.println("Código + 1: " + codigo);

		String palavra = "Java";		
		System.out.println("Palavra: " + palavra);

		palavra = "Estudando " + palavra + " em " + 2020;
		System.out.println(palavra);		

	}
}

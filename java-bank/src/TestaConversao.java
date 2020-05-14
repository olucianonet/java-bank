
public class TestaConversao {

	public static void main(String[] args) {

		double salario = 1250.9;
		// int valor = salario; não compila
		int valor = (int) salario; // casting
		
		System.out.printf("Valor: %d", valor);
		
		salario = valor; // perde precisão
		
		System.out.printf("%nSalário: %.2f", salario);
		
		double valor1 = 1.2;
		double valor2 = 1.4;
		double valor3 = valor1 + valor2;
		
		System.out.println("\nValor3: " + valor3); // 2.5999999999999996
		
		// float valor4 = 3.14; não compila, pois o Java considera como double.
		float valor4 = 3.14f;
		
		System.out.println("Valor 4: " + valor4);

		float valor5 = 1.2f;
		float valor6 = 1.4f;
		float valor7 = valor5 + valor6;
		
		System.out.println("Valor 7: " + valor7); // 2.6
		
		
		
	}
}

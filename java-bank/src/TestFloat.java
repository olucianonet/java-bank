
public class TestFloat {

	public static void main(String[] args) {

		double salario = 1280.40;
		
		System.out.println("Valor de salário: " + salario);
		
		int valor1 = 10;
		int valor2 = (int) salario;

		System.out.println("Valor 1: " + valor1 + 
				"\nValor 2 (salário truncado): " + valor2);
		
		int valor3 = 20;
		int valor4 = 7;
		
		int valor5 = valor3 / valor4;
		
		System.out.printf("%nResultado da divisão (truncado): %d / %d = %d",
				valor3, valor4, valor5);
		
		double valor6 = valor3 / valor4;
		
		System.out.printf("%nResultado da divisão (truncado): %d / %d = %.2f",
				valor3, valor4, valor6);
		
		double valor7 = 20;
		double valor8 = 7;
		double valor9 = valor7 / valor8;
		
		System.out.printf("%nResultado da divisão: %.2f / %.2f = %.2f",
				valor7, valor8, valor9);
		
		double valor10 = 20.0;
		double valor11 = 7.0;
		double valor12 = valor10 / valor11;
		
		System.out.printf("%nResultado da divisão: %.2f / %.2f = %.2f",
				valor10, valor11, valor12);
				
		double valor13 = 20 / 7;
		
		System.out.printf("%nResultado da divisão: %d / %d = %.2f",
				20, 7, valor13);
			
		double valor14 = 20.0 / 7.00;
		
		System.out.printf("%nResultado da divisão: %.2f / %.2f = %.2f",
				20.0, 7.0, valor14);
		
		double valor15 = 20 / 7;
		
		System.out.printf("%nResultado da divisão: %d / %d = %.2f",
				20, 7, valor15);		
		
	}

}

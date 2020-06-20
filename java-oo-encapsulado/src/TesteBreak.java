
public class TesteBreak {
	public static void main(String args[]) {
		teste2();
	}

	static void teste1() {
		for (int linha = 0; linha < 5; linha++) {
			System.out.println("Entrando no for interno...");
			for (int coluna = 0; coluna < 5; coluna++) {
				
				System.out.println("valor de linha: " + linha + ", valor de coluna: " + coluna);
				if (coluna > linha) {
					System.out.println("Entrando no if (coluna > linha)...");
					System.out.println("Saindo no for interno...");
					break;
				}
				System.out.println("Imprimindo o valor de coluna: " + ++coluna);
				System.out.println("Incrementando o valor de coluna");
			}
			System.out.println();
			System.out.println("Incrementando o valor de linha");
		}
	}

	static void teste2() {
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				if (coluna > linha) {
					break;
				}
				System.out.print(coluna + 1);
			}
			System.out.println();
		}
	}
}
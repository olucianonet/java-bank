
public class TestaLacos {
	
	public static void main(String[] args) {
		
		int produto = 0;
		
		for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {
			for (int multiplicando = 0; multiplicando <= 10; multiplicando++) {
				produto = multiplicando * multiplicador;
				System.out.printf("%2d x %2d = %3d ", multiplicador, multiplicando, produto);
			}
			
			System.out.println();
		}
		
	}

}

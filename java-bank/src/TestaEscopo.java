
public class TestaEscopo {

	public static void main(String[] args) {

		/*
		 * Esse código não compila, pois a variável acompanhado foi criada dentro do if.
		 * Tendo seu escopo local.
		 * 
			int idade = 18;
			int pessoas = 1;		
			
			if (pessoas >= 2) {
				boolean acompanhado = true;
			} else {
				boolean acompanhado = false;
			}
			
			if (idade >= 18 && acompanhado){
				System.out.println("Vc é maior de idade E está acompanhado, seja Bem Vindo!");
			} else {					
				System.out.println("Vc é menor de idade OU não está acompanhado, entrada não autorizada!");			
			}
		*/
		
		int idade = 18;
		int pessoas = 1;
		boolean acompanhado = false;
		
		if (pessoas >= 2) {
			acompanhado = true;
		} 
		
		System.out.println("Minha idade 5: " + idade + ", Acompanhado: " + acompanhado);
		
		if (idade >= 18 && acompanhado){
			System.out.println("Vc é maior de idade E está acompanhado, seja Bem Vindo!");
		} else {					
			System.out.println("Vc é menor de idade OU não está acompanhado, entrada não autorizada!");			
		}			

	}

}

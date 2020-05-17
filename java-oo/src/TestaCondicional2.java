
public class TestaCondicional2 {

	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		System.out.println();
		
		int idade1 = 17;
		int pessoas1 = 1;
		
		System.out.println("Minha idade 1: " + idade1 + ", Pessoas: " + pessoas1);
		
		if (idade1 >= 18 || pessoas1 > 1){
			System.out.println("Vc é maior de idade ou está acompanhado, seja Bem Vindo!");
		} else {					
			System.out.println("Vc é menor de idade, entrada não autorizada!");			
		}
		
		System.out.println();
		
		int idade2 = 17;
		int pessoas2 = 2;
		
		System.out.println("Minha idade 2: " + idade2 + ", Pessoas: " + pessoas2);
		
		if (idade2 >= 18 || pessoas2 > 1){
			System.out.println("Vc é maior de idade ou está acompanhado, seja Bem Vindo!");
		} else {					
			System.out.println("Vc é menor de idade, entrada não autorizada!");			
		}		

		System.out.println();
		
		int idade3 = 17;
		int pessoas3 = 2;
		
		System.out.println("Minha idade 3: " + idade3 + ", Pessoas: " + pessoas3);
		
		if (idade3 >= 18 && pessoas3 > 1){
			System.out.println("Vc é maior de idade E está acompanhado, seja Bem Vindo!");
		} else {					
			System.out.println("Vc é menor de idade, entrada não autorizada!");			
		}		

		System.out.println();
		
		int idade4 = 18;
		int pessoas4 = 2;
		
		System.out.println("Minha idade 4: " + idade4 + ", Pessoas: " + pessoas4);
		
		if (idade4 >= 18 && pessoas4 > 1){
			System.out.println("Vc é maior de idade E está acompanhado, seja Bem Vindo!");
		} else {					
			System.out.println("Vc é menor de idade, entrada não autorizada!");			
		}	
		
		System.out.println();
		
		int idade = 18;
		int pessoas = 2;
		boolean acompanhado = (pessoas >= 2);
		
		System.out.println("Minha idade 4: " + idade + ", Acompanhado: " + acompanhado);
		
		if (idade >= 18 && acompanhado){
			System.out.println("Vc é maior de idade E está acompanhado, seja Bem Vindo!");
		} else {					
			System.out.println("Vc é menor de idade OU não está acompanhado, entrada não autorizada!");			
		}
		
		System.out.println();
		
		idade = 18;
		pessoas = 1;
		acompanhado = (pessoas >= 2);
		
		System.out.println("Minha idade 5: " + idade + ", Acompanhado: " + acompanhado);
		
		if (idade >= 18 && acompanhado){
			System.out.println("Vc é maior de idade E está acompanhado, seja Bem Vindo!");
		} else {					
			System.out.println("Vc é menor de idade OU não está acompanhado, entrada não autorizada!");			
		}		
		
	}	
}

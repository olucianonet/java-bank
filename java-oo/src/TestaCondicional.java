
public class TestaCondicional {
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		System.out.println();
		
		int idade1 = 18;
		int quantidadeDePessoas1 = 1;
		
		System.out.println("Minha idade 1: " + idade1 + " Acompanhante: " + quantidadeDePessoas1);
		
		if (idade1 >= 18){
			System.out.println("Vc é maior de idade, seja Bem Vindo!");
		} else {
			if (quantidadeDePessoas1 > 1){
				System.out.println("Vc é menor de idade, entrada autorizada com acompanhante!");					
			} else {			
				System.out.println("Vc é menor de idade, entrada não autorizada!");
			}
		}
		
		System.out.println();
		
		int idade2 = 17;
		int quantidadeDePessoas2 = 1;
		
		System.out.println("Minha idade 2: " + idade2 + " Acompanhante: " + quantidadeDePessoas2);
		
		if (idade2 >= 18){
			System.out.println("Vc é maior de idade, seja Bem Vindo!");
		} else {
			if (quantidadeDePessoas2 > 1){
				System.out.println("Vc é menor de idade, entrada autorizada com acompanhante!");					
			} else {			
				System.out.println("Vc é menor de idade, entrada não autorizada!");
			}
		}
		
		System.out.println();
		
		int idade3 = 17;
		int quantidadeDePessoas3 = 2;
		
		System.out.println("Minha idade 3: " + idade3 + " Acompanhante: " + quantidadeDePessoas3);
		
		if (idade3 >= 18){
			System.out.println("Vc é maior de idade, seja Bem Vindo!");
		} else {
			if (quantidadeDePessoas3 > 1){
				System.out.println("Vc é menor de idade, entrada autorizada com acompanhante!");					
			} else {			
				System.out.println("Vc é menor de idade, entrada não autorizada!");
			}
		}		
		
	}
}

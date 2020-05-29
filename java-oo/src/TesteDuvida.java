
public class TesteDuvida {

	public static void main(String[] args) {

		/*
		 * Esse é seu segundo código
		 */
		int salario = 2801;
		
		if (salario >= 1900 && salario <= 2800) {
			System.out.println("O valor deduzido será de R$142.");
		} else if (salario > 2800 && salario <= 3751) {
			System.out.println("O valor deduzido será de R$350.");
		} else if (salario > 3751.01) {
			System.out.println("O valor deduzido será de R$636.");
		} else {
			System.out.println("Não será deduzido nenhum valor.");
		}
		
		if (salario >= 1900 && salario <= 2800) {
			System.out.println("O valor deduzido será de R$142.");
		} 
		
		if (salario > 2800 && salario <= 3751) {
			System.out.println("O valor deduzido será de R$350.");
		}
		
		if (salario > 3751.01) {
			System.out.println("O valor deduzido será de R$636.");
		} 
		
		if (salario < 1900) {
			System.out.println("Não será deduzido nenhum valor.");
		}	
		
        // Aqui vc está testando a condição, que retorna false 
        if (salario >= 1900 && salario <= 2800) {
            System.out.println("O valor deduzido será de R$142.");
        }
        
        // Aqui retorna true, já que salário é maior que 2800
        if (salario > 2800 && salario <= 3751) {
            System.out.println("O valor deduzido será de R$350.");
        }

        // Aqui retorna false, porém como vc utilizou um else
        if (salario > 3751.01) {
            System.out.println("O valor deduzido será de R$636.");
        } else {
        	// o fluxo passará por aqui tbm.
            System.out.println("Não será deduzido nenhum valor.");
        }
        
        /*
         * Como disse anteriormente, fazendo assim vc acaba testando true duas vezes.
         * 
         * O melhor seria ou utilizar if...else ou somente if
         */
		
		
		

	}

}

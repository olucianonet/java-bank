
public class TestaGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente("Pedro", "123", 10000.0);
		
		System.out.println("Dados do Gerente\n\tNome: " + g1.getNome() + 
				", Salario: $" + g1.getSalario() + ", Bonificação: $" + g1.getBonificacao());
		
		System.out.println();
		System.out.println("Gerente autenticando (Método 1): " + g1.autentica(123));
		System.out.println("Configurando senha! ***");
		g1.setSenha(123);
		System.out.println("Gerente autenticando (Método 1): " + g1.autentica(123));

		System.out.println("Gerente autenticando (Método 2): " + g1.autentica("123", 123));
	}

}

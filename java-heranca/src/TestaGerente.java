
public class TestaGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente("Pedro", "1234567890", 10000.0);
		
		System.out.println("Dados do Gerente\n\tNome: " + g1.getNome() + 
				", Bonificação: " + g1.getBonificacao());
		
		System.out.println("Gerente autenticando: " + g1.autentica(123));
		System.out.println("Configurando senha! ***");
		g1.setSenha(123);
		System.out.println("Gerente autenticando: " + g1.autentica(123));
	}

}

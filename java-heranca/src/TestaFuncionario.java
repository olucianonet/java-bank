
public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Pedro", "1234567890", 5000.0);
		
		System.out.println("Funcionario: " + f1.getNome() + ", Bonificação: " + f1.getBonificacao());
		
	}

}

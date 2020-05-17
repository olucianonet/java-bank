
public class TestaConstrutores {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("João", "1234567890", "joao@email.com");
		Conta conta1 = new Conta(1, 1, cliente1, 1000.0);
		
		Cliente cliente2 = new Cliente("Pedro", "1234567890", "joao@email.com");
		Conta conta2 = new Conta(1, 2, cliente2, 2000.0);
		
		System.out.println("Dados das contas: \n");
		System.out.println("Titular: " + conta1.getTitular().getNome() + "\nSaldo: " + conta1.getSaldo());
		System.out.println();
		System.out.println("Titular: " + conta2.getTitular().getNome() + "\nSaldo: " + conta2.getSaldo());
		
		System.out.println();
		System.out.println("Total de contas: " + Conta.getTotalDeContas());
	}

}

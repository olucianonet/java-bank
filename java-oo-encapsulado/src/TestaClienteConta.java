
public class TestaClienteConta {

	public static void main(String[] args) {

		Conta conta1 = new Conta();
		Cliente cliente1 = new Cliente();

		cliente1.setNome("João");
		cliente1.setCPF("1234567890");
		cliente1.setEmail("joao@email.com");

		conta1.setAgencia(1);
		conta1.setConta(1);
		conta1.setTitular(cliente1);
		conta1.deposita(1000.0);

		System.out.println("Dados da conta:");
		System.out.println("\tTitular: " + conta1.getTitular().getNome() + "\n\tSaldo: " + conta1.getSaldo());

	}
}

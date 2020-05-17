
public class TestaClienteConta {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Cliente cliente1 = new Cliente();
		
		cliente1.nome = "João";
		cliente1.cpf = "1234567890";
		cliente1.email = "joao@email.com";
		
		conta1.agencia = 1;
		conta1.conta = 1;
		conta1.titular = cliente1;
		conta1.saldo = 1000.0;
		
		System.out.println("Dados da conta:");
		System.out.println("\tTitular: " + conta1.titular.getNome() + 
				"\n\tSaldo: " + conta1.saldo);
				
	}

}

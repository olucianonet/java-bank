
public class TestaContas {

	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente(1, 1, new Cliente());
		ContaPoupanca cp1 = new ContaPoupanca(1, 2, new Cliente());
		
		cc1.deposita(200.0);
		cp1.deposita(300.0);
		
		System.out.println("Saldo das contas: " + 
				"\nCP 1: " + cp1.getSaldo() +
				"\nCC 1: " + cc1.getSaldo());
		System.out.println();
		
		System.out.println("Transferindo 100 da cc1 para a cp1");		
		cc1.transfere(cp1, 100);
		System.out.println();
		
		System.out.println("Saldo das contas: " + 
				"\nCP 1: " + cp1.getSaldo() +
				"\nCC 1: " + cc1.getSaldo());
		
	} 

}

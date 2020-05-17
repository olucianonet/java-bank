
public class TestaMetodos {

	public static void main(String[] args) {

		System.out.println("Criando contas c1/c2");
		System.out.println("");
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.deposita(1000.0);
		c2.deposita(100.0);
		
		System.out.println("Depositando $1000.0 em c1 e $100.0 em c2");
		System.out.println("Saldo da c1: " + c1.saldo);
		System.out.println("Saldo da c2: " + c2.saldo);
		System.out.println();

		System.out.println("Sacando $100.0 em c1 e $10.0 em c2");
		boolean saqueC1 = c1.saca(100.0);
		boolean saqueC2 = c2.saca(10.0);
		
		System.out.println("Saque em c1: " + saqueC1 + ", saque em c2: " + saqueC2);
		System.out.println("Saldo da c1: " + c1.saldo);
		System.out.println("Saldo da c2: " + c2.saldo);
		System.out.println();

		System.out.println("Transferindo $200 de c1 para c2");
		boolean transfereC1ParaC2 = c1.transfere(c2, 200);
		
		System.out.println("Transfere $200 de c1 para c2: " + transfereC1ParaC2);
		System.out.println("Saldo da c1: " + c1.saldo);
		System.out.println("Saldo da c2: " + c2.saldo);
		System.out.println();
		
		
		
	}

}

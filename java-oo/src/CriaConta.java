
public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 500;
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 200;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta: " + primeiraConta.saldo);
		System.out.println("Segunda conta: " + segundaConta.saldo);
	}

}

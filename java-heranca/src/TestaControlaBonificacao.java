
public class TestaControlaBonificacao {

	public static void main(String[] args) {

		Gerente f1 = new Gerente("Joao", "123", 5000.0);
		Supervisor s1 = new Supervisor("Carlos", "321", 4000.0);
		Analista a1 = new Analista("Paulo", "432", 3000.0);
		
		ControlaBonificacao cb = new ControlaBonificacao();
		cb.registra(f1);
		cb.registra(s1);
		cb.registra(a1);
		
		System.out.println("Total de bonificações: " + cb.getSoma());	
		
	}

}

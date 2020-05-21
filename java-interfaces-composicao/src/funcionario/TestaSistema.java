package funcionario;


public class TestaSistema {

	public static void main(String[] args) {

		Gerente g1 = new Gerente("Paulo", "123", 5000.0);
		g1.setSenha(123);
		
		Supervisor s1 = new Supervisor("Joao", "111", 3000.0);
		s1.setSenha(123);
		
		Cliente c1 = new Cliente();
		c1.setSenha(321);
		
		SistemaInterno si = new SistemaInterno();
		si.defineSenha(123);
		
		if (si.autentica(g1)) {
			System.out.println("Autenticação do " + g1.getClass() + " realizada com sucesso!");
		} else {
			System.out.println("Não foi possível realizar a autenticação!");			
		}
		
		if (si.autentica(s1)) {
			System.out.println("Autenticação do " + s1.getClass() + " realizada com sucesso!");
		} else {
			System.out.println("Não foi possível realizar a autenticação!");			
		}

		if (si.autentica(c1)) {
			System.out.println("Autenticação do " + c1.getClass() + " realizada com sucesso!");
		} else {
			System.out.println("Não foi possível realizar a autenticação do + " 
					+ c1.getClass() + " !");			
		}

		
	}

}

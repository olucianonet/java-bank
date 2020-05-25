package funcionario;

public class TestaSistema {

	public static void main(String[] args) {

		Gerente g1 = new Gerente("Paulo", "123", 5000.0);
		g1.setSenha(123);
		
		SistemaInterno si = new SistemaInterno();
		si.defineSenha(123);
		
		if (si.autentica(g1)) {
			System.out.println("Autenticação realizada com sucesso!");
		} else {
			System.out.println("Não foi possível realizar a autenticação!");			
		}
		
	}

}

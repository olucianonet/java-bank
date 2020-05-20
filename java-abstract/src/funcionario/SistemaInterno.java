package funcionario;

public class SistemaInterno {

	private int senha;	
	
	public void defineSenha(int senha){
		this.senha = senha;
	}
	
	public boolean autentica(Gerente gerente){
		
		return gerente.autentica(this.senha);
	}
}

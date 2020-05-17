package funcionario;

@Deprecated
public class FuncionarioAutenticavel extends Funcionario {

	private int senha;	
	
	public FuncionarioAutenticavel(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	public void setSenha(int senha){
		this.senha = senha;
	}
	
	public boolean autentica(int senha){
		
		return this.senha == senha;
	}
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

}

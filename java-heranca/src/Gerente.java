
public class Gerente extends Funcionario {

	private int senha;
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}		

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha){
		
		return this.senha == senha;
	}
	
	public boolean autentica(String cpf, int senha) {
		
		return super.getCPF() == cpf && this.senha == senha;

	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}	
}

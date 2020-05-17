package funcionario;

public class Supervisor extends Funcionario {

	public Supervisor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.1;
	}	
}

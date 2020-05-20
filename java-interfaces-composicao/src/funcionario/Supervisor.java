package funcionario;

public class Supervisor extends Funcionario implements Autenticavel {

	private Autenticador autenticador;

	public Supervisor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.autenticador = new Autenticador();
	}

	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.1;
	}

	@Override
	public void setSenha(int senha) {
		autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
	}
}

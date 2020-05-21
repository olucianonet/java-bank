package funcionario;

public class Gerente extends Funcionario implements Autenticavel {

	private Autenticador autenticador;

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.autenticador = new Autenticador();
	}

	public void setSenha(int senha) {
		autenticador.setSenha(senha);
	}

	public boolean autentica(String cpf, int senha) {
		return super.getCPF() == cpf && autenticador.autentica(senha);
	}

	@Override
	public double getBonificacao() {
		return (this.getSalario() * 0.1) + super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
	}
}

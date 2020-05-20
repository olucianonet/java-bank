package funcionario;

public class Cliente implements Autenticavel {

	private String nome;
	private String cpf;
	private String email;
	private int senha;

	public Cliente() {
		this("Nome", "CPF", "Email");
	}

	public Cliente(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;

	}

	@Override
	public boolean autentica(int senha) {
		return this.senha == senha;
	}
}

package conta;

public class Cliente {

	private String nome;
	private String cpf;
	private String email;

	public Cliente () {
		this("Nome", "CPF", "Email");
	}
	
	public Cliente(String nome, String cpf, String email){		
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
}

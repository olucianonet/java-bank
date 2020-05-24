
public class Funcionario {

	// poderia ter definido como protected para que 
	// as classes fillhas pudessem acessar,
	private String nome;
	private String cpf;
	private double salario;

	public Funcionario(String nome, String cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public double getBonificacao() {

		return this.salario * 0.1;

	}
	
	public double getSalario() {
		return this.salario;
	}	

	public String getCPF() {
		return this.cpf;
	}

}

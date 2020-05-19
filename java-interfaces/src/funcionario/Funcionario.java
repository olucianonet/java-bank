package funcionario;

public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	public Funcionario(){}
	
	public Funcionario(String nome, String cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public abstract double getBonificacao();
	
	public double getSalario() {
		return this.salario;
	}	

	public String getCPF() {
		return this.cpf;
	}

}

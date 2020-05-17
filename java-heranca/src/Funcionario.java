
public class Funcionario {

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
}

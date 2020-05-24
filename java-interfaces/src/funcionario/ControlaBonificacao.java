package funcionario;

public class ControlaBonificacao {

	private double soma;
	
	// Polimorfismo.
	public void registra(Funcionario funcionario){
		
		System.out.println("Registrando bonificação de " + funcionario.getBonificacao());
		this.soma += funcionario.getBonificacao();
	}
	
	public double getSoma(){
		return this.soma;
	}
	
}

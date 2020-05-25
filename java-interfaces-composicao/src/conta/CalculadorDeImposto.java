package conta;

public class CalculadorDeImposto {

	private double totalDeImposto;
	
	public void registra(Tributavel tributavel){
		
		this.totalDeImposto += tributavel.getValorImposto();
	}
	
	public double getTotalDeImposto(){
		return this.totalDeImposto;
	}	
}

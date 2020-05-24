package conta;

public class SeguroDeVida implements Tributavel{

	private double valor;
	
	public SeguroDeVida(double valor) {		
		this.valor = valor;
	}
	
	@Override
	public double getValorImposto() {
		return this.valor * 0.05;
	}

}

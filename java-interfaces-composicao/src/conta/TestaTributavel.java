package conta;

public class TestaTributavel {

	public static void main(String[] args) {

		ContaCorrente c1 = new ContaCorrente(1, 1, new Cliente());
		c1.deposita(1000.0);
		
		SeguroDeVida s1 = new SeguroDeVida(500.0);
		
		CalculadorDeImposto cdi = new CalculadorDeImposto();
		cdi.registra(c1);
		cdi.registra(s1);
		
		System.out.println("Total de imposto: " + cdi.getTotalDeImposto());
	}

}

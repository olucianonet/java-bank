
public class TestaCalculaAliquota {

	public static void main(String[] args) {

		double salario = 3000.0;
		double aliquota = 0.0;
		double deducao = 0.0;
		double imposto = 0.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			aliquota = 0.075;
			deducao = 142.0;
			imposto = (salario * aliquota) - deducao;
		}

		if (salario >= 2800.01 && salario <= 3751.0) {
			aliquota = 0.15;
			deducao = 350.0;
			imposto = (salario * aliquota) - deducao;
		}

		if (salario >= 3751.01) {
			aliquota = 0.225;
			deducao = 636.0;
			imposto = (salario * aliquota) - deducao;
		}

		System.out.println("Cálculo do IR");
		System.out.printf("%nSalário: %.2f %nAliquota: %.2f %nDedução: %.2f %nIR: %.2f",
				salario, aliquota, deducao, imposto);
		
	}

}

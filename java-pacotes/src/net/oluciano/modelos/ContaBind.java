package net.oluciano.modelos;

public class ContaBind extends Conta {

	/*
	 * Quando você declara uma variável de instância em uma classe 
	 * filha com o mesmo nome de uma da classe mãe, você está usando 
	 * uma técnica chamada shadowing.
	 * 
	 * https://www.guj.com.br/t/duvida-heranca-de-atributos/50064/6
	 */
	protected int numero = 10;
	
	public int getThisNumero(){
		
		return this.numero;
	}
	
	public int getSuperNumero(){
		
		return super.numero;
	}
	
}

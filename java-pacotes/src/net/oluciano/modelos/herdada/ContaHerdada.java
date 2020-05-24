package net.oluciano.modelos.herdada;

import net.oluciano.modelos.ContaBind;

public class ContaHerdada extends ContaBind {
	
	protected int anoDeAbertura;	
	
	public boolean verificaNumero(){
		return this.numero == 0;
	}
	
//	protected void setAnoAbertura(int anoDeAbertura) {
//		this.anoDeAbertura = anoDeAbertura;
//	}
	
}

package net.oluciano.util;

import net.oluciano.modelos.Conta;

public class GuardadorDeContas {
	
	private Conta[] contas;
	private int quantidadeDeContas;
	
	public GuardadorDeContas() {
		this.contas = new Conta[10];
		this.quantidadeDeContas = 0;
	}
	
	public void adicionarConta(Conta conta){
		
		this.contas[quantidadeDeContas] = conta;
		this.quantidadeDeContas++;
	}
	
	public Conta getConta(int posicao){
		return this.contas[posicao];
	}

	public int getQuantidadeDeContas() {
		return this.quantidadeDeContas;
	}

}

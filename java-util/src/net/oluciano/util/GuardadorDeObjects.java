package net.oluciano.util;

public class GuardadorDeObjects {

	
	private Object[] objetos;
	private int quantidadeDeObjetos;
	
	public GuardadorDeObjects() {
		this.objetos = new Object[10];
		this.quantidadeDeObjetos = 0;
	}
	
	public void adicionarObjeto(Object objeto){
		
		this.objetos[quantidadeDeObjetos] = objeto;
		this.quantidadeDeObjetos++;
	}
	
	public Object getObjeto(int posicao){
		return this.objetos[posicao];
	}

	public int getQuantidadeDeObjetos() {
		return this.quantidadeDeObjetos;
	}

}

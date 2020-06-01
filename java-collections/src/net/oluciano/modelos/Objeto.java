package net.oluciano.modelos;

public class Objeto {

	private int id;
	private double peso;

	public Objeto(int id, double peso) {
		this.id = id;
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		
		return this.id == ((Objeto) obj).getId();
	}

	
	
	
}



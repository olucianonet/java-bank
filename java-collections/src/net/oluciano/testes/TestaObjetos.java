package net.oluciano.testes;

import java.util.ArrayList;
import java.util.List;

import net.oluciano.modelos.Objeto;

public class TestaObjetos {
	
	public static void main(String[] args) {

		List<Objeto> objetos = new ArrayList<Objeto>();
		Objeto o1 = new Objeto(1, 1.0);
		Objeto o2 = new Objeto(2, 2.0);
		Objeto o3 = new Objeto(2, 1.0);

		//objetos.add(o1);
		objetos.add(o2);
		objetos.add(o3);

		System.out.println(objetos.get(0).getId());
		System.out.println(objetos.contains(o1));

	}
}
package net.oluciano.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {

		int quantidade = 100000;		
		
		Collection<Integer> lista = new ArrayList<Integer>();
		
		long inicioAddList = System.currentTimeMillis();
		
		for (int i = 0; i < quantidade; i++) {
			lista.add(i);			
		}
		
		long fimAddList = System.currentTimeMillis();
		System.out.println("Lista, Tempo de inserção: " + (fimAddList - inicioAddList));
		
		long inicioGetList = System.currentTimeMillis();
		
		for (Integer item : lista) {
			lista.contains(item);
		}

		long fimGetList = System.currentTimeMillis();
		System.out.println("Lista, Tempo de recuperação: " + (fimGetList - inicioGetList));
		
		
		Collection<Integer> conjunto = new HashSet<Integer>();
		
		long inicioAddSet = System.currentTimeMillis();
		
		for (int i = 0; i < quantidade; i++) {
			conjunto.add(i);			
		}
		
		long fimAddSet = System.currentTimeMillis();
		System.out.println("Conjunto, Tempo de inserção: " + (fimAddSet - inicioAddSet));
		
		long inicioGetSet = System.currentTimeMillis();
		
		for (Integer item : conjunto) {
			conjunto.contains(item);
		}

		long fimGetSet = System.currentTimeMillis();
		System.out.println("Conjunto, Tempo de recuperação: " + (fimGetSet - inicioGetSet));		
	
	}

}

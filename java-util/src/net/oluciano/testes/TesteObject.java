package net.oluciano.testes;

public class TesteObject {

	public static void main(String[] args) {

		int[] ints = new int[3];
		ints[0] = 1;
		ints[1] = 10;
		ints[2] = 100;

		System.out.println("Elemento 3: " + ints[2]);
		System.out.println("Tamanho do array: " + ints.length);
			
		int[] ar = new int[5];

		for (int i = 0; i < ar.length; i++) {			
			ar[i] = (int) Math.pow(i, i);		
		}
		
		for (int p = 0; p < ar.length; p++) {
			System.out.printf("%d ", ar[p]);			
		}

	}

}

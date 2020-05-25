package net.oluciano.testes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestaScanner {

	public static void main(String[] args) throws FileNotFoundException {

		/*
		 * Leitura de arquivos com Scanner
		 * Uso de delimitador com Scanner
		 * Formatação de texto e também de números
		 * Definição de Localização para formatar o texto.
		 */
		
		Scanner sc = new Scanner(new File("lorem-read.txt"));
		String line;

		while(sc.hasNextLine()) {
			line = sc.nextLine();
			System.out.println(line);		
		}
		
		sc.close();
		
	}

}

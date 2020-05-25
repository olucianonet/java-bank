package net.oluciano.testes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestaLeituraComEncoding {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("file-ISO-8859-1.txt"), "UTF-8");
		
		while (sc.hasNext()) {
			
			System.out.println(sc.nextLine());	
			
		}

	}

}

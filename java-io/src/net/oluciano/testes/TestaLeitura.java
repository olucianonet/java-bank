package net.oluciano.testes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestaLeitura {

	public static void main(String[] args) throws IOException {

		/*
		 * Abertura de arquivos;
		 * Leitura linha a linha do arquivo e detecção de seu fim;
		 * Utilização de exceptions pelo Java IO 
		 * 	caso a operação de leitura não saia como esperado;
		 * Classes abstratas e concretas para leitura.
		 */
		
		// Somente lê bytes
		InputStream fis = new FileInputStream("lorem-reader.txt");
		// transforma byte em caracteres
		Reader isr = new InputStreamReader(fis);
		// leitura de linhas inteiras
		BufferedReader bis = new BufferedReader(isr);
		
		String line = bis.readLine();
		
		while (line != null) {
			System.out.println(line);
			line = bis.readLine();
			
		}
		
		bis.close();
		
	}

}

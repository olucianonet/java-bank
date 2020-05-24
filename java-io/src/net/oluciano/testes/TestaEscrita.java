package net.oluciano.testes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestaEscrita {

	public static void main(String[] args) throws IOException {

		/*
		 * escrever em arquivos;
		 * escrever usando outputs diferentes;
		 * Ler e escrever dados abstraindo implementação;
		 * Classes abstratas e concretas para escrita e leitura.
		 */
		
		OutputStream fos = new FileOutputStream("lorem-write.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod");
		bw.newLine();
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");
		bw.close();

	}
}

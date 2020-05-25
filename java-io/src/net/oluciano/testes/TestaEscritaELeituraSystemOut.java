package net.oluciano.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TestaEscritaELeituraSystemOut {

	public static void main(String[] args) throws IOException {

		/*
		 * escrever em arquivos;
		 * escrever usando outputs diferentes;
		 * Ler e escrever dados abstraindo implementação;
		 * Classes abstratas e concretas para escrita e leitura.
		 */

		InputStream fis = System.in;
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		OutputStream fos = new FileOutputStream("lorem-write.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String line = br.readLine();

		while (line != null && !line.isEmpty()) {
			bw.write(line);
			bw.newLine();
			line = br.readLine();
		}

		br.close();
		bw.close();

	}
}

package net.oluciano.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TestaEscritaELeituraSystemIn {

	public static void main(String[] args) throws IOException, InterruptedException {

		/*
		 * escrever em arquivos;
		 * escrever usando outputs diferentes;
		 * Ler e escrever dados abstraindo implementação;
		 * Classes abstratas e concretas para escrita e leitura.
		 */

		InputStream fis = new FileInputStream("lorem-read.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		OutputStream fos = System.out;
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String line = br.readLine();

		while (line != null && !line.isEmpty()) {
			bw.write(line);
			bw.flush();
			sleep(1);

			bw.newLine();
			line = br.readLine();
		}

		br.close();
		bw.close();

	}
	
	public static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

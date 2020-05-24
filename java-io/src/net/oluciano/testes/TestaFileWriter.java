package net.oluciano.testes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TestaFileWriter {

	public static void main(String[] args) throws IOException {

		/*
		 * Várias alternativas para estabelecer uma saída para um arquivo de texto, como:
		 * A classe FileWriter
		 * A classe PrintStream
		 * A classe PrintWriter
		 * Alguns detalhes da classe System, como :
		 * O atributo System.out é do tipo PrintStream
		 * O método System.lineSeparator() devolve os caracteres que representam uma nova linha
		 * O método System.currentTimeMillis() devolve os 
		 * milissegundos que passaram desde 1 de janeiro de 1970
		 */
		
		FileWriter fw = new FileWriter("lorem-write.txt");
		fw.write("Linha 1 com FileWrite");
		fw.write(System.lineSeparator());
		fw.write("Linha 2 com FileWrite");
		fw.write(System.lineSeparator());
		fw.write("Linha 3 com FileWrite");
		
		fw.close();
		System.out.println("Olhe o arquivo 1");
		sleep(5);
		
		FileWriter fw2 = new FileWriter("lorem-write.txt");
		BufferedWriter bw = new BufferedWriter(fw2);
		bw.newLine();
		bw.write("Linha 4 com BufferedWriter");
		
		bw.close();
		System.out.println("Olhe o arquivo 2");
		sleep(5);
		
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("lorem-write.txt"));
		bw2.newLine();
		bw2.write("Linha 5 com BufferedWriter");
		
		bw2.close();
		System.out.println("Olhe o arquivo 3");
		sleep(5);
		
		PrintStream ps = new PrintStream("lorem-write.txt");
		ps.println("Linha com 6 PrintStrem");
		
		ps.close();		
		System.out.println("Olhe o arquivo 4");
	}
	
	public static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}	

}

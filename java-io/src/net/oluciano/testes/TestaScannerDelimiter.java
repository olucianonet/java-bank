package net.oluciano.testes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import net.oluciano.modelos.Pessoa;

public class TestaScannerDelimiter {

	public static void main(String[] args) throws FileNotFoundException {		
		
		/*
		 * Leitura de arquivos com Scanner
		 * Uso de delimitador com Scanner
		 * Formatação de texto e também de números
		 * Definição de Localização para formatar o texto.
		 */
		
		Scanner sc = new Scanner(new File("info.csv"));
		String line = sc.nextLine();
		
		Scanner delimiter = new Scanner(line);

		delimiter.useDelimiter(",");

		String nome = delimiter.next();
		String sobrenome = delimiter.next();
		int idade = delimiter.nextInt();
		double altura = delimiter.nextDouble();
		
		Pessoa p1 = new Pessoa(nome, sobrenome, idade, altura);
		
		System.out.println(p1);
		
		sc.close();
	}

}

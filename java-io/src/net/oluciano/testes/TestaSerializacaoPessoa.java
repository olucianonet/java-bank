package net.oluciano.testes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import net.oluciano.modelos.Pessoa;

public class TestaSerializacaoPessoa {

	public static void main(String[] args) throws IOException, Exception {

		Pessoa p1Out = new Pessoa("John", "Code", 20, 1.80);
		
		System.out.println("Escrevendo objeto...");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pessoa.bin"));
		oos.writeObject(p1Out);
		
		System.out.println();
		System.out.println("Lendo objeto...");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pessoa.bin"));
		
		Pessoa p1In = (Pessoa) ois.readObject();
		System.out.println(p1In);
	}

}

package net.oluciano.testes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestaSerializacaoEscrita {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String nome = "Luciano";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		oos.writeObject(nome);
		oos.close();

	}

}

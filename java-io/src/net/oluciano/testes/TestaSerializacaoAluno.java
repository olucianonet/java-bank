package net.oluciano.testes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import net.oluciano.modelos.Aluno;

public class TestaSerializacaoAluno {

	public static void main(String[] args) throws IOException, Exception {

		Aluno a1Out = new Aluno("John", "Code", 20, 1.80, "Java");
		
		System.out.println("Escrevendo objeto...");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.bin"));
		oos.writeObject(a1Out);
		
		System.out.println();
		System.out.println("Lendo objeto...");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.bin"));
		
		Aluno a1In = (Aluno) ois.readObject();
		System.out.println(a1In);
	}

}

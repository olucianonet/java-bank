package net.oluciano.testes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import net.oluciano.modelos.AlunoComposto;
import net.oluciano.modelos.Curso;

public class TestaSerializacaoAlunoComposto {

	public static void main(String[] args) throws IOException, Exception {

		AlunoComposto ac1Out = new AlunoComposto("John", "Code", 20, 1.80, 
				new Curso("Java", 120));

		System.out.println("Escrevendo objeto...");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno-composto.bin"));
		oos.writeObject(ac1Out);

		System.out.println();
		System.out.println("Lendo objeto...");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno-composto.bin"));

		AlunoComposto ac1In = (AlunoComposto) ois.readObject();
		System.out.println(ac1In);

	}
}

package net.oluciano.testes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * https://cursos.alura.com.br/forum/topico-nao-apareceu-a-primeira-frase-do-arquivo-lorem-txt2-114383
 * 
 * Teste de arquivo que não aparecia no projeto.
 */
public class testeEscrita {

    public static void main(String[] args) throws IOException {

        // Fluxo de saída do Arquivo
        OutputStream fos = new FileOutputStream("lorem3.txt"); 
        Writer osw = new OutputStreamWriter(fos); 
        BufferedWriter bw = new BufferedWriter(osw); 

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        bw.newLine();
        bw.newLine();
        bw.write(" aheuheuheauaheuaehae");


        bw.close();



    }

}
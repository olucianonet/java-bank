package net.oluciano.testes;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class TestaUnicodeEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String letra = "L";		
		System.out.println("codepoint " + letra.codePointAt(0));		
		System.out.println();
		
		byte[] bytes_utf8 = letra.getBytes();
		System.out.println(bytes_utf8[0] + ", " + bytes_utf8.length + ", utf-8");

		System.out.println();
		byte[] bytes_windows1252 = letra.getBytes("windows-1252");
		System.out.println(bytes_windows1252[0] + ", " + bytes_windows1252.length + ", windows-1252");
		
		System.out.println();
		byte[] bytes_utf16 = letra.getBytes("UTF-16");
		System.out.println(bytes_utf16[0] + ", " + bytes_utf16.length + ", UTF-16");
		
		System.out.println();
		byte[] bytes_ascii = letra.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes_ascii[0] + ", " + bytes_ascii.length + ", US-ASCII");

		System.out.println();
		String char_utf8 = new String(bytes_utf8);
		System.out.println(char_utf8);

		System.out.println();
		String char_windows1252 = new String(bytes_windows1252, "windows-1252");
		System.out.println(char_windows1252);

		System.out.println();
		String char_utf16 = new String(bytes_utf16, "UTF-16");
		System.out.println(char_utf16);
		
		System.out.println();
		String char_ascii = new String(bytes_ascii, StandardCharsets.US_ASCII);
		System.out.println(char_ascii);	
		
	}

}

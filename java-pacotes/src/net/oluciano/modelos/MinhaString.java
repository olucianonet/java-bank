package net.oluciano.modelos;

public class MinhaString implements CharSequence{

	private String word;
	
	public MinhaString(String word) {
		this.word = word;
	}
	
	@Override
	public int length() {
		return this.word.length();
	}

	@Override
	public char charAt(int index) {
		return this.word.charAt(index);
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return this.word.subSequence(start, end);
	}

	@Override
	public String toString() {
		return this.word.toString();
	}
}

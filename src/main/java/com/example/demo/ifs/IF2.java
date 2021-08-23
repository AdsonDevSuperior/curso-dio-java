package com.example.demo.ifs;

public class IF2 {

	public static void main(String[] args) {

		final var letra = "B";
		
		if ("A".equals(letra)) {
			System.out.println("É a letra A");
		}
		
		if (!letra.equals("A")) {
			System.out.println("Não é a letra A ");
		}
	}

}

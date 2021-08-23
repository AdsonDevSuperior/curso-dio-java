package com.example.demo.strings;

public class Strings {

	public static void main(String[] args) {

		var nome = "Adson";
		var sobreNome = "silva";
		final var nomeCompleto = nome + sobreNome;
		
		System.out.println(nome);
		System.out.println("Nome do cliente " + nome);
		System.out.println("Nome e sobrenome " + nomeCompleto);
		var String = new String("Minha String");
		
		System.out.println("Char na posição: " + String.charAt(4));
		System.out.println("Quantidade " + String.length());
		System.out.println("Sem trim [" + String + "]");
		System.out.println("Com trim [" + String.trim() + "]");
		System.out.println("Lower " + String.toLowerCase());
		System.out.println("Upper " + String.toUpperCase());
		System.out.println("Contem M? " + String.contains("M"));
		System.out.println("Contem X? " + String.contains("X"));
		System.out.println("Replace " + String.replace("n", "$"));
		System.out.println("Equals? " + String.equals(" Minha String "));
		System.out.println("EqualsIgnoreCasse? " + String.equalsIgnoreCase("Minha String fodonaaaaaaaaaaaa"));
		System.out.println("Substring(1,6)" + String.substring(1, 6));	
		
	}

}

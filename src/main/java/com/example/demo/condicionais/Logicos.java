package com.example.demo.condicionais;

public class Logicos {

	public static void main(String[] args) {


		final var numero = 2;
		final var letra = "A";
		
		//Sorte Circuit
		if (numero < 5 && letra.equals("A")) {
			System.out.println("Atendeu as condições ");
		}
		
		if (numero < 5 || letra.equals("A")) {
			System.out.println("Atendeu a segunda condição ");
		}
		
		final var letra1 = "B";
		  
		if ("A".equals(letra1)) {
			System.out.println("É a letra A ");
			
		}
		
		if (!letra.equals("A")) {
			System.out.println("Não é a letra A");
		}
	}

}

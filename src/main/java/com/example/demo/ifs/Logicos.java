package com.example.demo.ifs;

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
		
	}

}

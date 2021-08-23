package com.example.demo.strings;

public class StringsBuilders {

	public static void main(String[] args) {

		var nome = "Andre";
		
		final var builder = new StringBuilder(nome);
		
		//  adiciona strings a strings anteriores 
		System.out.println(builder.append(" Luiz"));
		
		final var reverse = builder.reverse();
		
		System.out.println(reverse);
		
		final var insert = reverse.insert(0, "#").insert(reverse.length(),"#");
		System.out.println(insert);
	
	
	}

}

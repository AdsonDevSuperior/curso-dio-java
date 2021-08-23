package com.example.demo.strings;

public class StringFormat {

	public static void main(String[] args) {
		
	var nome = "Andre";
	var sobreNome = "Gomes";
	
	final var nomecompleto = nome + sobreNome;
	
	System.out.println(nome);
	System.out.println("Nome do cliente " + nome);
	System.out.println("Nome Completo do cliente :  + nomeCompleto");
	
	final var mensagem = String.format("O Cliente %s possui sobre nome %s ", nome, sobreNome);
	System.out.println(mensagem);
	
	System.out.println(String.format("Numero %.2f ", 2.4334));
	}

}

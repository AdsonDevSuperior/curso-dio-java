package com.example.demo.ifs;

public class IF {

	public static void main(String[] args) {
		
	final var condicao = false;
	
	if (condicao) {
		System.out.println("A condição  é verdadeira");
		
	} else {
		System.out.println("A condição é falsa");
	}
	
	if(condicao) 
		System.out.println("Uma única linha... ");
	
	final var tenario = condicao ? "é verdadeira " : "é falsa";
	System.out.println(tenario);  
	}

}

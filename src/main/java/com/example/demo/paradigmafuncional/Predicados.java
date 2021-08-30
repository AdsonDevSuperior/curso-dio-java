package com.example.demo.paradigmafuncional;

import java.util.function.Predicate;

public class Predicados {
	public static void main(String[] args) {
		
		// Predicates recebem um parametro e recebe true ou false
		
		//Predicate<String> estaVazio = valor -> valor.isEmpty();		
		Predicate<String> estaVazio = String::isEmpty;		
		System.out.println(estaVazio.test(""));
		System.out.println(estaVazio.test("João"));
	}

}

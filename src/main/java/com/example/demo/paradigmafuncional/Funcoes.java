package com.example.demo.paradigmafuncional;

import java.util.function.Function;

public class Funcoes {

	public static void main(String[] args) {
		Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
		Function<String, Integer> converteStringParaInteiroCalculandoDobro = String -> Integer.valueOf(String) * 2;
		System.out.println(retornaNomeAoContrario.apply("João"));
		System.out.println(converteStringParaInteiroCalculandoDobro.apply("800000"));
	}

}

package com.example.demo.paradigmafuncional;

public class FuncaoComLambda {

	public static void main(String[] args) {
		
		// Funções lambdas usando paradigma funcionais = interfaces
		Funcao colocarPrefixoSenhorNaString = valor -> "Sr. "+valor;
		System.out.println(colocarPrefixoSenhorNaString.gerar("João"));
	}
}
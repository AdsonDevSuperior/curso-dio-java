package com.example.demo.interfacesfuncionais;

// Uma função de altar ordem é aquela que retorna uma função ou recebe uma função como parametro

public class FuncaoAltaOrdem {
	public static void main(String[] args) {
		Calculo SOMA = (a,b) -> a+b;
		Calculo SUBTRACAO = (a,b) -> a-b;
		Calculo DIVISAO = (a,b) -> a/b;
		Calculo MULTIPLICACAO = (a,b) -> a*b;
		
		System.out.println(executarOperacao(SOMA, 1, 3));
		System.out.println(executarOperacao(SUBTRACAO, 4, 3));
		System.out.println(executarOperacao(DIVISAO, 12, 3));
		System.out.println(executarOperacao(MULTIPLICACAO, 12, 23));
		
	}
	
	public static int executarOperacao(Calculo calculo, int a, int b) {
		return calculo.calcular(a,b);
	}
}

interface Calculo {
	public int calcular(int a, int b);
}

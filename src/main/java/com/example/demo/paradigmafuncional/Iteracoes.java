package com.example.demo.paradigmafuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

	public static void main(String[] args) {
		String[] nomes = {"João", "Adson", "Santos", "Java", "Super", "Andes"};
		Integer[] numeros = {1, 2, 3, 4, 5};
		imprimirNomesFiltrados(nomes);
		imprimirNumerosFiltrados(numeros);

		List<String> profissoes = new ArrayList<>();
		profissoes.add("Desenvolvedor");
		profissoes.add("Ressoante");
		profissoes.add("Gerente");
		profissoes.add("Gerente de Gerente");
		
		profissoes.stream()
			.filter(profissao -> profissao.startsWith("Gerente"))
			.forEach(System.out::println);
	}
	
//	public static void imprimirNomesFiltrados(String... nomes) {
//		
//		String nomesParaImprimir = "";
//		for (int i = 0; i < nomes.length; i++) {
//			if (nomes[i].equals("João")) {
//				nomesParaImprimir+=""+nomes[i];
//			}
//		}
//		System.out.println("Nomes do for: "+nomesParaImprimir);
//		
//		String nomesParaImprimirDaStream = 
//				Stream.of(nomes)
//				.filter(nome -> nome.equals("João"))
//				.collect(Collectors.joining());
//		
//		System.out.println("Nomes do stream: "+nomesParaImprimirDaStream);
//	}


public static void imprimirNomesFiltrados(String... nomes) {
	for (String nome : nomes) {
		System.out.println("Nomes no for: "+nome);
	}
	
	Stream.of(nomes)
	.forEach(nome -> System.out.println( "Immprimido pelo forEach: "+nome));
	
}

public static void imprimirNumerosFiltrados(Integer... numeros) {
	for (Integer numero : numeros ) {
		System.out.println("Numero de for"+numero*2);
	}
	
	Stream.of(numeros).map(numero -> numero*4)
					  .forEach(System.out::println);
}


}
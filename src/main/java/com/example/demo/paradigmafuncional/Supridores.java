package com.example.demo.paradigmafuncional;

import java.util.function.Supplier;

public class Supridores {

	public static void main(String[] args) {
		//Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
		Supplier<Pessoa> instanciaPessoa = Pessoa::new;

		System.out.println(instanciaPessoa.get());

	}

}

class Pessoa {
	private String nome;
	private Integer idade;

	public Pessoa() {
		nome = "João";
		idade = 23;

	}

	@Override
	public String toString() {
		return String.format("Nome : %s, Idade : %d", nome, idade);
	}
}
package com.example.demo.paradigmafuncional;

import java.util.function.Consumer;

public class Consumidores {
	public static void main(String[] args) {

		Consumer<String> imprimaUmaFrase = System.out::println;
		// Consumer<String> imprimaUmaFrase2= frase -> System.out.println(frase);
		imprimaUmaFrase.accept(Messages.getString("Consumidores.0")); //$NON-NLS-1$
	}

}

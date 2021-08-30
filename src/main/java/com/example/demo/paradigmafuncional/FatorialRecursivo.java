package com.example.demo.paradigmafuncional;

public class FatorialRecursivo {

	public static void main(String[] args) {
		System.out.println(fatorial(5));
	}

	// Fatorial de um Determinado número é ele multiplicado pelos seus antecessores
		//EX: Fatorial de 5 -> 5 * 4 * 3 * 2 * 1
	
	public static int fatorial(int value) {
		if (value == 1) {
			return value;
		} else {
			return value * fatorial((value - 1 ));
		}

	}
}

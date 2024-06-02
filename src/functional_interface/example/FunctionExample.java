package functional_interface.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
 * representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * é utilizada para tranformar ou mapear os elementos do Stream
 * em outros valores ou tipos
 */

public class FunctionExample {
	public static void main(String[] args) {
		
		//criar uma lista de números inteiros
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		
		//usar a Function com expressão lambda para dobrar todos os números
		Function<Integer, Integer> dobrar = numero -> numero * 2;
		
		//usar a função ára dobrar todos os números no Stream e armazená-los em outra lista
		List<Integer> numerosDobrados = numeros.stream().map(dobrar).toList();
		
		//imprimir a lista de números dobrados
		numerosDobrados.forEach(System.out::println);
	}
}

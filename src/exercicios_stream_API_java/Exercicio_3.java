package exercicios_stream_API_java;

import java.util.List;

/*
 * Desafio 3 - Verifique se todos os números da lista são positivos:
Com a ajuda da Stream API, verifique se todos os números da lista 
são positivos e exiba o resultado no console.
 */

public class Exercicio_3 {
	public static void main(String[] args) {
		//lista
		List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		//se isso retornar true todos são positivos
		boolean x = numeros.stream().allMatch(n -> n > 0);
		
		String resultado = (x) ? "Todos os números da lista são positivos." : "A lista possui número(s) negativo(s).";
		
		System.out.println(resultado);
		
	}
}

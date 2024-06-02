package exercicios_stream_API_java;

import java.util.List;

/*
 * Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma dos números pares 
da lista e exiba o resultado no console.
 */

public class Exercicio_2 {
	public static void main(String[] args) {
		//lista
		List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		Integer somaDosPares = numeros.stream().filter(n -> n%2==0).reduce(0, (a, b) -> a+b);
		System.out.println(somaDosPares);
	}
}

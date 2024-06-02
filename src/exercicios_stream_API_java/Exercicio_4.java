package exercicios_stream_API_java;

import java.util.List;

/*
 * Desafio 4 - Remova todos os valores ímpares:
Utilize a Stream API para remover os valores ímpares da lista 
e imprima a lista resultante no console.
 */

public class Exercicio_4 {
	public static void main(String[] args) {
		//lista
		List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		numeros.stream().filter(n -> n%2==0).forEach(System.out::println);
	}
}

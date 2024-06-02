package exercicios_stream_API_java;

import java.util.List;

/*
 * Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
Utilizando a Stream API, encontre a soma dos quadrados 
de todos os números da lista e exiba o resultado no console.
 */

public class Exercicio_11 {
	public static void main(String[] args) {
		// lista
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int somaDosQuadrados = numeros.stream().mapToInt(n -> n * n).sum();       
        System.out.println("A soma dos quadrados de todos os números da lista é: " + somaDosQuadrados);
	}
}

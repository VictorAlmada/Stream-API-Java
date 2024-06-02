package exercicios_stream_API_java;

import java.util.List;

/*
 * Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
Com a Stream API, verifique se todos os números da lista são 
distintos (não se repetem) e exiba o resultado no console.
 */

public class Exercicio_9 {
	public static void main(String[] args) {
		//lista
		List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		//quantidade de elementos na lista
		long qtdNumeros = numeros.stream().count();
		//nova lista com elementos sem repetição de valores
		List<Integer> numerosSemRepetidos = numeros.stream().distinct().toList();
		//quantidades de elementos na lista de valores sem repetidos
		long qtdNumerosSemRepetidos = numerosSemRepetidos.stream().count();
		//mensagem dizendo se há ou não repetidos
		String resultado = (qtdNumerosSemRepetidos < qtdNumeros) ?
				"Há números repetidos na lista." : "Não há números repetidos na lista.";
		System.out.println(resultado);
	}
}

package exercicios_stream_API_java;

import java.util.List;

/*
 * Desafio 5 - Calcule a média dos números maiores que 5:
Com a Stream API, calcule a média dos números 
maiores que 5 e exiba o resultado no console.
 */

public class Exercicio_5 {
	public static void main(String[] args) {
		//lista
		List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		//pegar os maiores que cinco em uma nova lista
		List<Integer> maioresQueCinco = numeros.stream().filter(n -> n > 5).toList();
		
		//somar os números
		int soma = maioresQueCinco.stream().reduce(0, Integer::sum);
		
		//quantidade de números que são maiores que cinco
		long countMaioresQueCinco = maioresQueCinco.size();
		
		//média dos números
		double media = (countMaioresQueCinco > 0) ? soma/countMaioresQueCinco : 0;
		
		System.out.println(media);

	}
}

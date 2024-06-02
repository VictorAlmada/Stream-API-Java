package exercicios_stream_API_java;

import java.util.Comparator;

/*
 * Desafio 7 - Encontrar o segundo número maior da lista:
Com a ajuda da Stream API, encontre o segundo número 
maior da lista e exiba o resultado no console.
 */

import java.util.List;
import java.util.Optional;

public class Exercicio_7 {
	public static void main(String[] args) {
		//lista
		List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		//retira os valores duplicados da lista
		//ordena a lista em ordem descrescente, 
		//pula o primeiro valor(que no caso será o maior valor, ou seja, o 10),
		//pega com findFirst() o primeiro valor que no caso agora é o 9		
		Optional<Integer> segundoMaior = numeros.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();

		segundoMaior.ifPresentOrElse(
				max -> System.out.println("O segundo maior valor é: " + max),
				() -> System.out.println("A lista não contêm um segundo maior valor"));
			
	}
}

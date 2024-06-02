package exercicios_stream_API_java;

import java.util.List;

/*
 * Desafio 6 - Verificar se a lista contém algum número maior que 10:
Utilize a Stream API para verificar se a lista contém 
algum número maior que 10 e exiba o resultado no console.
 */

public class Exercicio_6 {
	public static void main(String[] args) {
		//lista
		List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		//booleano pra saber se tem maior que dez
		boolean possuiMaiorQueDez = numeros.stream().anyMatch(n -> n > 10);
		
		//filtrando os maiores que 10 e colocando em uma lista
		List<Integer> numerosMaioresQueDez = numeros.stream().filter(n -> n > 10).toList();
		
		//if/else pra imprimir pro usuário se há ou não números maior que dez
		String resultado = possuiMaiorQueDez ? "A lista possui número(s) maior(es) que 10."
				: "A lista não possui nenhum número maior que 10.";
		System.out.println(resultado);
		
		//se há números maiores que dez, imprimir na tela
		if (!numerosMaioresQueDez.isEmpty()) {
			System.out.print("Números maiores que 10: ");
			for (Integer i : numerosMaioresQueDez) {
				System.out.print(i + " ");
			}
		}
		}
		
	}


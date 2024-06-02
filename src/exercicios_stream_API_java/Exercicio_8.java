package exercicios_stream_API_java;

import java.util.List;

/*
 * Desafio 8 - Somar os dígitos de todos os números da lista:
Utilizando a Stream API, realize a soma dos dígitos de 
todos os números da lista e exiba o resultado no console.
 */

public class Exercicio_8 {
	public static void main(String[] args) {
		//lista
		List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		int somaDigitos = numeros.stream()
				.flatMap(n -> String.valueOf(n).chars().mapToObj(c -> c - '0'))
				.reduce(0, Integer::sum);
		
		System.out.println(somaDigitos);
	}
	
	/*
	 * Explicação do Código
		numeros.stream():
		
		Inicia o processamento com um Stream da lista de números.
		flatMap(n -> String.valueOf(n).chars().mapToObj(c -> c - '0')):
		
		String.valueOf(n).chars(): Converte o número em uma String e depois em 
		um IntStream de caracteres Unicode (valores inteiros dos caracteres).
		
		mapToObj(c -> c - '0'): Converte os caracteres de volta 
		para inteiros (os dígitos). Subtrair '0' de um caractere Unicode 
		de um dígito decimal resulta no valor numérico correspondente 
		do dígito. Por exemplo, o caractere '5' (valor Unicode 53) 
		menos '0' (valor Unicode 48) resulta em 5.
		
		flatMap: Achata os resultados dos mapeamentos em um 
		único Stream de dígitos.
		
		reduce(0, Integer::sum):
		Realiza a soma de todos os dígitos. O reduce começa com um 
		valor inicial de 0 e aplica a função Integer::sum para 
		acumular a soma dos dígitos.
			 * 
	 */

}

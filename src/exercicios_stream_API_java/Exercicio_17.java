package exercicios_stream_API_java;

import java.util.List;

/*
 * Desafio 17 - Filtrar os números primos da lista:
Com a ajuda da Stream API, filtre os 
números primos da lista e exiba o resultado no console.
 */

public class Exercicio_17 {
	public static void main(String[] args) {
		// Lista de números
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        List<Integer> primos = numeros.stream().filter(Exercicio_17::isPrime).toList();
        
        System.out.println("Números primos na lista: " + primos);
	}
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}

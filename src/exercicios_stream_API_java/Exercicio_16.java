package exercicios_stream_API_java;

import java.util.List;

/*
 * Desafio 16 - Agrupe os números em pares e ímpares:
Utilize a Stream API para agrupar os números em duas listas separadas, 
uma contendo os números pares e outra contendo 
os números ímpares da lista original, 
e exiba os resultados no console.
 */

public class Exercicio_16 {
	public static void main(String[] args) {
		// Lista de números
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).toList();
        List<Integer> impares = numeros.stream().filter(n -> n % 2 != 0).toList();
        
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        }
}

package exercicios_stream_API_java;

import java.util.List;

/*
 * Desafio 18 - Verifique se todos os números da lista são iguais:
Utilizando a Stream API, verifique se todos os 
números da lista são iguais e exiba o resultado no console.
 */

public class Exercicio_18 {
	public static void main(String[] args) {
		// Lista de números
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //List<Integer> numeros = List.of(4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4);
		boolean iguais = numeros.stream().allMatch(n -> n.equals(numeros.get(0)));
		String resultado = (iguais) ? "Iguais" : "Diferentes";
		System.out.println(resultado);
	}
}
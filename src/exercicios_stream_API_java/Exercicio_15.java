package exercicios_stream_API_java;

import java.util.List;

/*
 * Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
Utilizando a Stream API, verifique se a lista contém pelo menos 
um número negativo e exiba o resultado no console.
 */

public class Exercicio_15 {
	public static void main(String[] args) {
		// Lista de números
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean negativosNaLista = numeros.stream().anyMatch(n -> n < 0);
        String resultado  = negativosNaLista ? "A lista contém número(s) negativo(s)."
        		: "A lista não contém números negativos.";
        System.out.println(resultado);
	}
}
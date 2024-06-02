package exercicios_stream_API_java;

import java.util.List;

/*
 * Desafio 12 - Encontre o produto de todos os números da lista:
Com a ajuda da Stream API, encontre o produto de todos 
os números da lista e exiba o resultado no console.
 */
public class Exercicio_12 {
	public static void main(String[] args) {
		// lista
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        long produtoDosNumeros = numeros.stream().reduce(1, (n1, n2) -> n1 * n2);
        
        System.out.println("O produto de todos os números da lista é: " + produtoDosNumeros);
	}
}

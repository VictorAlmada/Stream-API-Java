package exercicios_stream_API_java;

import java.util.List;

/*
 * Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
 * Com a Stream API, encontre a soma dos números da lista que são divisíveis 
 * tanto por 3 quanto por 5 e exiba o resultado no console.
 */

public class Exercicio_19 {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 30, 45);
        
        // Filtra os números divisíveis tanto por 3 quanto por 5 (ou seja, por 15)
        Integer soma = numeros.stream()
                              .filter(n -> n % 15 == 0)
                              .reduce(0, Integer::sum);
        
        // Exibe o resultado no console
        System.out.println("A soma dos números da lista que são divisíveis por 3 e 5 é: " + soma);
    }
}


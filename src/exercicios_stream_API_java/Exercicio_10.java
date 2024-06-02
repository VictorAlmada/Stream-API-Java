
package exercicios_stream_API_java;

import java.util.List;

public class Exercicio_10 {
    public static void main(String[] args) {
        // lista
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrando números que são ímpares e múltiplos de 3 ou 5 usando uma única stream
        List<Integer> multiplosImparesDeTresOuCinco = numeros.stream()
                .filter(n -> (n % 3 == 0 || n % 5 == 0) && n % 2 != 0).toList();

        // Exibindo o resultado
        System.out.println("Lista com os ímpares multiplos de 5 e 3: " + multiplosImparesDeTresOuCinco);
    }
}


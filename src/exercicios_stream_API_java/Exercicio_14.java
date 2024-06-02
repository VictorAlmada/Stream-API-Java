package exercicios_stream_API_java;

import java.util.List;
import java.util.Optional;

public class Exercicio_14 {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrar o maior número primo na lista
        Optional<Integer> maiorPrimo = numeros.stream()
                                              .filter(Exercicio_14::isPrime)
                                              .max(Integer::compareTo);

        // Exibir o resultado
        if (maiorPrimo.isPresent()) {
            System.out.println("O maior número primo da lista é: " + maiorPrimo.get());
        } else {
            System.out.println("Não há números primos na lista.");
        }
    }

    // Função auxiliar para verificar se um número é primo
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

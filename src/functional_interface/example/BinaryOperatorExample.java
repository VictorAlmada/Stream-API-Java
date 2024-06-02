package functional_interface.example;

import java.util.List;
import java.util.function.BinaryOperator;

/*
 * representa uma operação que combina dois argumentos do tipo T e retorna um
 * resultado do mesmo tipo T.
 * é usada para realizar operações de redução em pares de elementos,
 * como somar números ou combinar objetos.
 */

public class BinaryOperatorExample {
	public static void main(String[] args) {
		//criar uma lista de números inteiros
		List<Integer> numeros = List.of(1, 2, 3, 4, 5);
		
		//usar o binaryOperator com expressão lambda para somar dois números inteiros
		BinaryOperator<Integer> somar = (n1, n2) -> n1 + n2;
		
		//usar o Binaryoperator para somar todos os elementos no Stream
		int resultado = numeros.stream().reduce(0, somar);
		
		//imprimir o resultado da soma
		System.out.println("A soma dos números é: " + resultado);
	}
}

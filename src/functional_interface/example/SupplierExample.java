package functional_interface.example;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
	public static void main(String[] args) {
		/*
		 * representa uma operação que não aceita nenhum argumento e retorna um resultado
		 * do tipo T. é comumente usada para criar ou fornecer novos
		 * objetos de um determinado tipo.
		 */
		
		//usar o supplier com expressão lambda para fornecer uma saudação personalizada
		Supplier<String> saudacao = () -> "Olá, seja bem-vindo!";
		
		//usar o supplier p/ obter uma lista com 5 saudações
		List<String> listaSaudacoes = Stream.generate(saudacao)
				.limit(5).collect(Collectors.toList());
		
		//imprimir saudações geradas
		listaSaudacoes.forEach(s -> System.out.println(s));
		// ou listaSaudacoes.forEach(System.out::println);
		
		
	}
}

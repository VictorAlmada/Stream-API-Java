package functional_interface.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
 * representa uma função que aceita um argumento do tipo T e retorna um valor booleano.
 * é comumente usada para filtrar elementos do Stream com base em alguma condição.
 */

public class PredicateExample {
	public static void main(String[] args) {
		
		//criar uma lista de palavras
		List<String> palavras = new ArrayList<String>();
		palavras.add("java");
		palavras.add("kotlin");
		palavras.add("python");
		palavras.add("javascript");
		palavras.add("c");
		palavras.add("go");
		palavras.add("ruby");
		
		//criar um Predicate que verifica se a palavra tem mais de 5 caracteres
		Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
		
		//usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
		//imprimir cada palavra que passou pelo filtro
		palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);
	}
}

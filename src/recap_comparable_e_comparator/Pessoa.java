package recap_comparable_e_comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


	public class Pessoa implements Comparable<Pessoa> {
	    private String nome;
	    private int idade;

	    public Pessoa(String nome, int idade) {
	        this.nome = nome;
	        this.idade = idade;
	    }
	    
	    public String getNome() {
			return nome;
		}



		public void setNome(String nome) {
			this.nome = nome;
		}



		public int getIdade() {
			return idade;
		}



		public void setIdade(int idade) {
			this.idade = idade;
		}



		@Override
	    public int compareTo(Pessoa outra) {
	        return this.idade - outra.idade;
	    }
	    public String toString() {
	    	return "{" + nome + ", " + idade + "}";
	    }

	    public static void main(String[] args) {
	    	List<Pessoa> pessoas = new ArrayList<>();
	    	pessoas.add(new Pessoa("João", 25));
	    	pessoas.add(new Pessoa("Maria", 22));
	    	pessoas.add(new Pessoa("Julio", 18));
	    	pessoas.add(new Pessoa("Pedro", 55));
	    	pessoas.add(new Pessoa("Tiago", 30));
	    	
	    	//Collections.sort(pessoas);
	    	//System.out.println(pessoas);
	    	
	    	Collections.sort(pessoas, new ComparadorPorNome());
	    	System.out.println(pessoas);

		}
	}


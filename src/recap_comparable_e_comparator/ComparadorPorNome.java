package recap_comparable_e_comparator;
import java.util.Comparator;

public class ComparadorPorNome implements Comparator<Pessoa> {
	@Override
	public int compare(Pessoa p1, Pessoa p2) {
        return p1.getNome().compareTo(p2.getNome());
    }
}

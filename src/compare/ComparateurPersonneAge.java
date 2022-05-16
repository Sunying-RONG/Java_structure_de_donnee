package compare;

import java.util.Comparator;

public class ComparateurPersonneAge implements Comparator<Personne> {

	@Override
	public int compare(Personne p1, Personne p2) {
		boolean egal = (p1.getAge() == p2.getAge());
		boolean inf = (p1.getAge() < p2.getAge());
		if (egal) {
			return 0;
		} else if (inf) {
			return -1;
		} else {
			return 1;
		}
	}
	
}

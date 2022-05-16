package compare;
import java.util.Comparator;
public class ComparateurTailleChaines implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		boolean egal = (s1.length() == s2.length());
		boolean inf = (s1.length() < s2.length());
		if (egal) {
			return 0;
		} else {
			if (inf) {
				return -1;
			} else {
				return 1;
			}
		}
	}
}

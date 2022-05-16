package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static<E extends Comparable<E>> E max(List<E> c) {
		if(c.isEmpty()) {
			return null;
		}
		E max = c.get(0);
		for (E e : c) {
			if (e.compareTo(max)>0) {
				max = e;
			}
		}
		return max;
	}
	public static<E> E max(List<E> c, Comparator<E> comp) {
		if (c.isEmpty()) {
			return null;
		}
		E max = c.get(0);
		for (E e : c) {
			if (comp.compare(e, max) > 0) {
				max = e;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listeEntiers = new ArrayList<>();
		listeEntiers.add(4);
		listeEntiers.add(8);
		System.out.println(max(listeEntiers));
//		8
		
		LinkedList<String> listeChaines = new LinkedList<>();
		listeChaines.add("galette");
		listeChaines.add("crèpes");
		listeChaines.add("bugnes");
		System.out.println(max(listeChaines));
//		galette
		
		ArrayList<Personne> listePersonnes = new ArrayList<>();
		Personne p1 = new Personne("Anna", 40);
		Personne p2 = new Personne("Pierre", 30);
		Personne p3 = new Personne("Barbara", 25);
		listePersonnes.add(p1);
		listePersonnes.add(p2);
		listePersonnes.add(p3);		
		System.out.println(max(listePersonnes));
//		Personne [nom=Pierre, age=30]
		System.out.println(Collections.max(listePersonnes));
		System.out.println(Collections.max(listePersonnes, Collections.reverseOrder()));
//		Personne [nom=Anna, age=40]
		Collections.sort(listePersonnes);
		System.out.println(listePersonnes);
//		[Personne [nom=Anna, age=40], Personne [nom=Barbara, age=25], Personne [nom=Pierre, age=30]]
		
		String s1 = "abc";
		String s2 = "ab";
		ArrayList<String> stringlist = new ArrayList<String>();
		stringlist.add(s1);
		stringlist.add(s2);
		Comparator compString = new ComparateurTailleChaines();
		System.out.println(max(stringlist, compString));
//		abc
		System.out.println(Collections.max(stringlist, compString));
		Collections.sort(stringlist, compString);
		System.out.println(stringlist);
//		[ab, abc]
		
		Comparator compPersonne = new ComparateurPersonneAge();
		System.out.println(max(listePersonnes, compPersonne));
//		Personne [nom=Anna, age=40]
		System.out.println(Collections.max(listePersonnes, compPersonne));
		Collections.sort(listePersonnes, compPersonne);
		System.out.println(listePersonnes);
//		[Personne [nom=Barbara, age=25], Personne [nom=Pierre, age=30], Personne [nom=Anna, age=40]]
	}
}

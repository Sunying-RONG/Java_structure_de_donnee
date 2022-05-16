package seance6_linkedList;
public class MainMyNode {
	public static void main(String[] arg) {
		// On cree 3 MyNode isoles contenant les lettres "e", "n", "z"
		MyNode<String> e = new MyNode<String>(null, "e", null);
		MyNode<String> n = new MyNode<String>(null, "n", null);
		MyNode<String> z = new MyNode<String>(null, "z", null);
		// On attache les noeuds entre eux pour qu'ils soient dans l'ordre
		// "n" "e" "z"	
		// celui qui porte "n" est le premier et a pour suivant celui qui porte "e"
		n.next=e;
		// celui qui porte "e" a pour suivant celui qui porte "z"
		// et pour précédent celui qui porte "n"
		e.next=z;
		e.prev=n;
		// celui qui porte "z" pour précédent celui qui porte "e"
		z.prev=e;
		// Pour vérifier que la chaine est bien construite du début vers la fin, 
		// on parcourt en partant du noeud contenant "n"
		parcours(n);
		// et on le fait en sens inverse
		parcoursInverse(z);
		// Exercice 0 : ajouter "o" entre "e" et "z" et vérifier que les liens
		// sont bien reconstitués en parcourant dans un sens puis dans l'autre
		MyNode<String> o = new MyNode<String>(null, "o", null);
		e.next = o;
		o.next = z;
		z.prev = o;
		o.prev = e;
		parcours(n);
		parcoursInverse(z);
		// Exercice 1 : Creer 4 MyNode isoles contenant les lettres "a", "o", "d", "s"
		MyNode<String> a1 = new MyNode<String>(null, "a", null);
		MyNode<String> o1 = new MyNode<String>(null, "o", null);
		MyNode<String> d1 = new MyNode<String>(null, "d", null);
		MyNode<String> s1 = new MyNode<String>(null, "s", null);
		
		// Exercice 2 : attacher les MyNode entre eux 
		// pour qu'ils soient dans l'ordre "a" puis "d" puis "o" puis "s"
		a1.next = d1;
		d1.next = o1;
		o1.next = s1;
		
		s1.prev = o1;
		o1.prev = d1;
		d1.prev = a1;
		
		// Exercice 3 : vérifier que la chaine est bien construite du début vers la fin 
		// cela doit afficher "ados"
		parcours(a1);
		// Exercice 4 : vérifier que la chaine est bien construite de la fin vers le début
		// cela doit afficher "soda"
		parcoursInverse(s1);
	}
	private static void parcours(MyNode<String> n) {
		System.out.println("ordre normale");
		MyNode<String> courant1 = n;
		while (courant1 !=null) {
			System.out.println(courant1.item);
			courant1 = courant1.next; // on avance
		}
	}
	private static void parcoursInverse(MyNode<String> z) {
		System.out.println("ordre l'invers");
		MyNode<String> courant2 = z;
		while (courant2 !=null) {
			System.out.println(courant2.item);
			courant2 = courant2.prev; // on revient en arrière
		}
	}
}
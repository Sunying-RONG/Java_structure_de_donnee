package seance2_généricité;

import java.util.ArrayList;

public class FileAttente<P> {
	private String nomFile;
	private static int nbEntreesTotal = 0;
	private ArrayList<P> contenu;
	
	public FileAttente() {
		contenu = new ArrayList<P>();
	}
	
	public void entre(P p) {
		contenu.add(p);
		nbEntreesTotal++;
	}
	
	public P sort() {
		P p = null;
		if (!contenu.isEmpty()) {
			p = contenu.get(0);
			contenu.remove(0);
		}
		return p;
	}
	
	public int nbElements() {
		return contenu.size();
	}
	
	public boolean estVide() {
		return contenu.isEmpty();
	}
	
	public String toString() {
		return ""+descriptionContenu();
	}
	
	private String descriptionContenu() {
		String resultat = "";
		for (P p : this.contenu) {
			resultat += p + " ";
		}
		return resultat;
	}
	
	public static int nbEntre() {
		return nbEntreesTotal;
	}
	
	// public static<X,Y> boolean compare(FileAttente<X> f1, FileAttente<Y> f2) si différentes types
	// dans méthode static ne peut pas utiliser <P> qui est le formel de cette classe. 
	public static<X> boolean compareStaticMemeType(FileAttente<X> f1, FileAttente<X> f2) {
		return f1.contenu.equals(f2.contenu);
	}
	
	public boolean compareMemeType(FileAttente<P> f) {
		return contenu.equals(f.contenu);
	}
	
	public <X> boolean compareNonMemeType(FileAttente<X> f) {
		return contenu.size() == f.contenu.size();
	}
	
}

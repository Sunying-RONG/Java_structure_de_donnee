package seance3_généricité_bornée;

import java.util.ArrayList;

public class FileAttente<E extends InvitationI> {
	private String nomFile;
	private static int nbEntreesTotal = 0;
	private ArrayList<E> contenu;
	
	public FileAttente() {
		contenu = new ArrayList<E>();
	}
	
//	public void entre(E e) {
//		contenu.add(e);
//		nbEntreesTotal++;
//	}
	
	public void entre(E e) {
		if (e.isInvite()) {
			contenu.add(e);
		} else {
			System.out.println("non invite");
		}
	}
	
	public E sort() {
		E e = null;
		if (!contenu.isEmpty()) {
			e = contenu.get(0);
			contenu.remove(0);
		}
		return e;
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
		for (E e : this.contenu) {
			resultat += e + " ";
		}
		return resultat;
	}
	
	public static int nbEntre() {
		return nbEntreesTotal;
	}
	
	// public static<X,Y> boolean compare(FileAttente<X> f1, FileAttente<Y> f2) si différentes types, ajouter static
	// dans méthode static ne peut pas utiliser <P> qui est le formel de cette classe. 
	public static boolean compareStaticMemeType(
			FileAttente<? extends InvitationI> f1, FileAttente<? extends InvitationI> f2) {
		return f1.contenu.equals(f2.contenu);
	}
	
	public boolean compareMemeType(FileAttente<E> f) {
		return contenu.equals(f.contenu);
	}
	
	public <X extends InvitationI> boolean compareNonMemeType(FileAttente<X> f) {
		return contenu.size() == f.contenu.size();
	}
	
	public void ReceveurToParametre(FileAttente<? super E> f) {
		E e = sort();
		if (e != null) {
			f.entre(e);
		}
	}
	
	public void ParametreToReceveur(FileAttente<? extends E> f) {
		E e = f.sort();
		if (e != null) {
			entre(e);
		}
	}
	
}

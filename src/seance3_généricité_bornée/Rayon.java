package seance3_généricité_bornée;

import java.util.ArrayList;

// tous les E doit implémenter interface ObjetAvecEtiquette
public class Rayon<E extends ObjetAvecEtiquetteI> {
	private ArrayList<E> contenu = new ArrayList<E>();
	
	public Rayon() {
	}

	public Rayon(ArrayList<E> contenu) {
		this.contenu = contenu;
	}

	public String listingContenu() {
		String listing = "";
		for (E c : contenu) {
			listing += c.etiquette();
		}
		return listing;
	}
	
	public void ajouterProduit (E p) {
		if (!contenu.contains(p)) {
			contenu.add(p);
		}
	}

}

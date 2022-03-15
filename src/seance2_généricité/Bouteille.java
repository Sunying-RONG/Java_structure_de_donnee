package seance2_généricité;

public class Bouteille {
	private String nom;

	public Bouteille(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Bouteille [nom=" + nom + "]";
	}
	
	
}

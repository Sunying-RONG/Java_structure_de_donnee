package seance3_généricité_bornée;

public class Personne implements InvitationI {
	private String nom;

	public Personne(String nom) {
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
		return "Personne [nom=" + nom + "]";
	}

	@Override
	public boolean isInvite() {
		return true;
	}
	
	
}

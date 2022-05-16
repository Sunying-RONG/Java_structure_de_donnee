package seance2_généricité;
public class EtiquetteBouteille {
	private float degre;
	private String nomProducteur;
	private String adresse;
	private String descriptif;
	private float quantite;
	public EtiquetteBouteille(float degre, String nomProducteur, String adresse, String descriptif, float quantite) {
		super();
		this.degre = degre;
		this.nomProducteur = nomProducteur;
		this.adresse = adresse;
		this.descriptif = descriptif;
		this.quantite = quantite;
	}
	public float getDegre() {
		return degre;
	}
	public void setDegre(float degre) {
		this.degre = degre;
	}
	public String getNomProducteur() {
		return nomProducteur;
	}
	public void setNomProducteur(String nomProducteur) {
		this.nomProducteur = nomProducteur;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	public float getQuantite() {
		return quantite;
	}
	public void setQuantite(float quantite) {
		this.quantite = quantite;
	}
	@Override
	public String toString() {
		return "EtiquetteBouteille [degre=" + degre + ", nomProducteur=" + nomProducteur + ", adresse=" + adresse
				+ ", descriptif=" + descriptif + ", quantite=" + quantite + "]";
	}
}

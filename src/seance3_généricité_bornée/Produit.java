package seance3_généricité_bornée;

public class Produit implements ObjetAvecEtiquetteI {
	private String etiquette;

	public Produit() {
	}

	public Produit(String etiquette) {
		this.etiquette = etiquette;
	}

	public String getEtiquette() {
		return etiquette;
	}

	public void setEtiquette(String etiquette) {
		this.etiquette = etiquette;
	}

	@Override
	public String etiquette() {
		return etiquette;
	}
	

}

package seance2_généricité;

public class BouteilleEtiquetee<E> extends Bouteille {
	private E etiquette;

	public BouteilleEtiquetee(String nom, E etiquette) {
		super(nom);
		this.etiquette = etiquette;
	}

	public E getEtiquette() {
		return etiquette;
	}

	public void setEtiquette(E etiquette) {
		this.etiquette = etiquette;
	}

	@Override
	public String toString() {
		return "BouteilleEtiquetee [etiquette=" + etiquette + "]";
	}
	
	
}

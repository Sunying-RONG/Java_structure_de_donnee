package seance4_pile;
import java.util.ArrayList;
public class Pile<T> implements IPile<T> {
	// structure de stockage interne des  ́el ́ements
	private ArrayList<T> elements;
	// Mise en oeuvre des op ́erations
	public Pile(){
		initialiser();
		assert estVide();
	}
	public T depiler() throws PileVideException{
		int tailleOrigin = taille();
		if (this.estVide())
		throw new PileVideException("en d ́epilant");
		T sommet = elements.get(elements.size()-1);
		elements.remove(sommet);
		assert taille() == tailleOrigin - 1;
		return sommet;
	}
	public void empiler(T t) throws PilePleineException {
		int tailleOrigin = taille();
		elements.add(t);
//		assert this.sommet()==t : "dernier empile ="+this.sommet();
		assert this.elements.get(elements.size()-1) == t;
		assert taille() == tailleOrigin + 1;
	}
	public boolean estVide() {return elements.isEmpty();}
	public void initialiser() {
		elements = new ArrayList<T>();
//		assert estVide();
	}
	public T sommet() throws PileVideException{
		if (this.estVide())
		throw new PileVideException("en d ́epilant");
		return elements.get(elements.size()-1);
	}
	public int taille(){return elements.size();}
	public String toString(){return "Pile = "+ elements;}
}
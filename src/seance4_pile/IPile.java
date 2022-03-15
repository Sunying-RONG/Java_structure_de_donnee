package seance4_pile;

public interface IPile<T> {
	void initialiser();
	void empiler(T t) throws PilePleineException;
	T depiler()throws PileVideException;;
	T sommet() throws PileVideException;
	boolean estVide();
	int taille();
}

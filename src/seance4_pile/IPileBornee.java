package seance4_pile;

public interface IPileBornee<T> extends IPile<T> {
	int getTailleMax();
	void setTailleMax(int nouveauTaille) throws TailleNegativeException, TailleMaxTropPetiteException;
	void empiler(T t) throws PilePleineException;
}

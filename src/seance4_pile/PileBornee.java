package seance4_pile;

import java.util.ArrayList;

public class PileBornee<T> extends Pile<T> implements IPileBornee<T> {
	private int tailleMax;
	
	public PileBornee(int tailleMax) {
		super();
		this.tailleMax = tailleMax;
	}

	public PileBornee() {
		super();
		this.tailleMax = 10;
	}

	@Override
	public int getTailleMax() {
		return tailleMax;
	}
	
	@Override
	public void setTailleMax(int tailleMax) throws TailleNegativeException, TailleMaxTropPetiteException {
		if (tailleMax > 0) {
			if (tailleMax > this.taille()) {
				this.tailleMax = tailleMax;
			} else {
				throw new TailleMaxTropPetiteException("Taille max doit être plus grande que nb d'éléments déjà stocké");
			}
		} else {
			throw new TailleNegativeException("Taille ne doit pas être négative");
		}
	}
	
	@Override
	public void empiler(T t) throws PilePleineException {
		if (this.taille() < this.tailleMax) {
			super.empiler(t);
		} else {
			throw new PilePleineException("Pile est pleine");
		}
	}
	

}

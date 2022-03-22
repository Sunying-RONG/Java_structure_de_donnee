package seance5_streamsIterateurs;

import java.util.Iterator;

public class IteratorDirectionLycee implements Iterator<EmployeLycee> {
	int cursur; // = 0 par défaut
	DirectionLycee directionLycee; // = null par défaut
	
	public IteratorDirectionLycee(DirectionLycee directionLycee) {
		super();
		this.directionLycee = directionLycee;
	}

	@Override
	public boolean hasNext() {
		return cursur < 5;
	}

	@Override
	public EmployeLycee next() {
		EmployeLycee e = null;
		switch (cursur) {
		case 0:
			e = directionLycee.getProviseur();
			break;
		case 1:
			e = directionLycee.getProviseurAdjoint();
			break;
		case 2:
			e = directionLycee.getConseillerPrincipaldEducation();
			break;
		case 3:
			e = directionLycee.getGestionnaire();
			break;
		case 4:
			e = directionLycee.getChefDeTravaux();
		}
		cursur++;
		return e;
	}

}

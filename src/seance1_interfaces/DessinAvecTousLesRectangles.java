package seance1_interfaces;

import java.util.ArrayList;

public class DessinAvecTousLesRectangles {
	// attributs
	
	private ArrayList<Rectangle> listeRectangles
										= new ArrayList<>();
	
	// constructeurs
	
	public DessinAvecTousLesRectangles() {}
	
	// méthodes
	
	public void ajoute(Rectangle r) {
		if (! listeRectangles.contains(r))
			listeRectangles.add(r);
	}
	
	public double aireMoyenne() {
		int sommeAires=0;
		for (Rectangle r : listeRectangles)
			sommeAires+=r.aire();
		if (listeRectangles.isEmpty())
		{
			return 0;
		}
		else 
		{
			return sommeAires/listeRectangles.size();
		}
	}

}

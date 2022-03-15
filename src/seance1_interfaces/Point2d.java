package seance1_interfaces;

import java.util.Scanner;

/*
 * Cette classe doit décrire des points en 2 dimensions
 * en coordonnées entières et positives ou nulle.
 * On placera comme attributs les 2 coordonnées :
 * - en abscisse (x)
 * - en ordonnées (y)
 */

public class Point2d {
	
	// attributs
	
	private int x,y;
	
	// constructeurs
	
	public Point2d() {}
	public Point2d(int x, int y) {
		this.setX(x);this.setY(y);
	}
	
	// accesseurs qui vérifient les valeurs

	public int getX() {
		return x;
	}
	public void setX(int x) {
		if (x>=0) this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		if (y>=0) this.y = y;
	}	

	public void saisie(Scanner clavier) {
			System.out.println("x ? ");
			this.setX(clavier.nextInt());
			System.out.println("y ? ");
			this.setY(clavier.nextInt());
	}
	
	public String toSring() {
		return "x="+this.x+" y="+this.y;
	}
}

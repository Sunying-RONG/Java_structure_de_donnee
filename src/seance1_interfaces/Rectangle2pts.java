package seance1_interfaces;

import java.util.Scanner;

/*
 * On s'intéresse aux rectangles en coordonnées entières 
 * dans un plan. 
 * Le point en haut à gauche du plan a pour cooordonnées (0,0).
 * Les coordonnées vont croissantes en descendant, donc
 * seront toujours positives.
 * 
 * Schéma :
 * 
 * Dans cette classe rectangle, on stocke comme attributs
 * - le point en haut à gauche
 * - le point en bas à droite, dont les coordonnées doivent 
 *   être supérieures à celles du point en haut à gauche
 * 
 */

public class Rectangle2pts implements Rectangle{
	
	// attributs
	
	private Point2d pointHG = new Point2d();
	private Point2d pointBD = new Point2d();
	
	// constructeurs
	
	public Rectangle2pts() {}
	public Rectangle2pts(Point2d pointHG, Point2d pointBD) {
		
	}	
	
	// accesseurs qui vérifient les valeurs
	
	public Point2d getPointHG() {
		return pointHG;
	}
	public Point2d getPointBD() {
		return pointBD;
	}
	public void setPointHGetBD(Point2d pointHG, Point2d pointBD) {
		if (pointBD.getX()>=pointHG.getX()
				&& pointBD.getY()>=pointHG.getY())
		{this.pointHG = pointHG;this.pointBD = pointBD;}
	}

	
	// méthodes
	
	public void saisie(Scanner clavier) {
		System.out.println("Point haut gauche ?");
		pointHG.saisie(clavier);
		System.out.println("Point bas droite ?");
		pointBD.saisie(clavier);
	}

	public int aire() {
		return (pointBD.getX()-pointHG.getX()
				* pointBD.getY()-pointHG.getY());
	}
	
	// Question additionnelle
	
	@Override
	public int getLgx() {
		return pointBD.getX()-pointHG.getX();
	}
	@Override
	public int getLgy() {
		return pointBD.getY()-pointHG.getY();
	}

}

package seance1_interfaces;

import java.util.Scanner;

public class Carre1pt1lg implements Carre {
	
	private Point2d pointHG;
	private int cote;

	public Carre1pt1lg() {}

	public Carre1pt1lg(Point2d pointHG, int cote) {
		this.setPointHG(pointHG);
		this.setCote(cote);
	}

	public Point2d getPointHG() {
		return pointHG;
	}

	public void setPointHG(Point2d pointHG) {
		this.pointHG = pointHG;
	}

	public int getCote() {
		return cote;
	}

	public void setCote(int cote) {
		if (cote>=0) this.cote = cote;
	}

	@Override
	public int aire() {
		return this.cote*this.cote;
	}

	@Override
	public void saisie(Scanner clavier) {
		System.out.println("Point haut gauche ?");
		pointHG.saisie(clavier);
		System.out.println("lgx ?");
		this.setCote(clavier.nextInt());
	}

	@Override
	public int cote() {
		return this.cote;
	}

	// Question additionnelle
	
	@Override
	public Point2d getPointBD() {
		return new Point2d(pointHG.getX()+this.cote,
							pointHG.getY()+this.cote);
	}

	@Override
	public int getLgx() {
		return this.cote;
	}

	@Override
	public int getLgy() {
		return this.cote;
	}

}

package seance1_interfaces;

public class MainRectangles {

	public static void main(String[] arg) {
		Point2d p1 = new Point2d(1,2);
		Point2d p2 = new Point2d(3,3);
		Point2d p3 = new Point2d(4,5);

		Rectangle1pt2lg r1 = new Rectangle1pt2lg(p1, 2, 3);
		Rectangle1pt2lg r2 = new Rectangle1pt2lg(p2, 3, 4);
		
		Rectangle2pts r3 = new Rectangle2pts(p1,p2);
		Rectangle2pts r4 = new Rectangle2pts(p1,p3);
			
		// Dessin dans lequel on peut mettre des rectangles
		// quel que soit leur type, pourvu que 
		// ce type implémente l'interface Rectangle
		
		DessinAvecTousLesRectangles dessin 
						= new DessinAvecTousLesRectangles();
		dessin.ajoute(r1);
		dessin.ajoute(r2);	
		dessin.ajoute(r3);	
		dessin.ajoute(r4);	
		System.out.println("aire moyenne "+dessin.aireMoyenne());
		
		// appel de la méthode static
		System.out.println("r3 et r4 meme aire ? "
								+Rectangle.deMemeAire(r3, r4));	
		
		// appel de la méthode default
		System.out.println("r3 infos "+r3.infos());			
		
		// carres
		
		Carre c1 = new Carre1pt1lg(p1,6);
		Carre c2 = new Carre1pt1lg(p1,4);
		
		dessin.ajoute(c1);	
		dessin.ajoute(c2);			
		System.out.println("aire moyenne "+dessin.aireMoyenne());

		// Question additionnelle

		System.out.println("c1 phg "+c1.getPointHG().toSring());
		System.out.println("c1 pbd "+c1.getPointBD().toSring());
		System.out.println("c1 cote "+c1.cote());	
		System.out.println("c1 lgx "+c1.getLgx());		
		System.out.println("c1 lgy "+c1.getLgy());		
		}
}

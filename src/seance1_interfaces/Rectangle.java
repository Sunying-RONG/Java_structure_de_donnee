package seance1_interfaces;

import java.util.Scanner;

public interface Rectangle {
	// méthodes public abstract
	int aire(); 
	void saisie(Scanner clavier); 
	
	// question additionnelle
	Point2d getPointHG();
	Point2d getPointBD();
	int getLgx();
	int getLgy();
		
	// méthode public default
	default public String infos() {
		return "rectangle, d'aire "+this.aire();
	}
	
	// méthode public static
	static boolean deMemeAire(Rectangle r1, Rectangle r2) {
		return r1.aire() == r2.aire();
	}
	
	// attribut public static final
	
	int nbCotes=4;
	
	// Différence avec une classe abstraite :
	// - On ne peut pas mettre de constructeur
	// - Tout est public
	// - Les attributs sont forcément static final
}

package maps;

public class MainMyEntry {

	public static void main(String[] args) {

		// Suivant les associations que l'on crée
		// la clef et la valeur sont de différents types
		
		// Exemple : une MyEntry avec
		// clef : nom d'une personne célèbre
		// valeur : année de naissance
		
		MyEntry<String,Integer> e0 =
				new MyEntry<>("Manu Dibango",1933);
		
		// Exercices -----------------------------------------
		
		// Déclarer et créer une MyEntry avec
		// clef : numéro du département
		// valeur : département de l'hérault
		
		Departement H = new Departement(
				"Hérault","34",6224,"Montpellier",1444892,342);
		MyEntry<String,Departement> herault = new MyEntry<>("34",H);
		// Déclarer et créer une MyEntry avec
		// clef : nom d'un aliment (ex. fraise)
		// valeur : nombre de calories pour 100g (ex. 33)
		MyEntry<String,Float> fraise = new MyEntry<>("fraise",(float) 33);
		
		// Déclarer et créer une MyEntry avec
		// clef : pointure de chaussure (Ex. 42)
		// valeur : longueur de pied (Ex. 27 cm)
		MyEntry<Float,Float> chaussure = new MyEntry<>((float) 42,(float) 33);
		
	}

}

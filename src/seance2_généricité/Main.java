package seance2_généricité;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Personne p1 = new Personne("Paul");
		Personne p2 = new Personne("Anna");
		
		Tache t1 = new Tache(1, "finance");
		Tache t2 = new Tache(2, "programe");
		
		FileAttente<Personne> filePersonne = new FileAttente<>();
		filePersonne.entre(p1);
		filePersonne.entre(p2);
		filePersonne.sort();
		System.out.println("nb de personnes dans file d'attente : "+filePersonne.nbElements());

		
		FileAttente<Tache> fileTache = new FileAttente<>();
		fileTache.entre(t1);
		System.out.println("nb de tâches dans file d'attente : "+fileTache.nbElements());
		
		System.out.println("nb d'entrés dans toutes files d'attente : "+FileAttente.nbEntre());

		FileAttente<Personne> filePersonne2 = new FileAttente<>();
		filePersonne2.entre(p2);
		System.out.println("filePersonne et filePersonne2 ont même personne, appeler sur class ? "+FileAttente.compareStaticMemeType(filePersonne, filePersonne2));
		
		System.out.println("filePersonne et filePersonne2 ont même personne, appeler sur objet ? "+filePersonne.compareMemeType(filePersonne2));
		
		System.out.println("filePersonne et fileTache ont même nombre d'objets, appeler sur objet ? "+filePersonne.compareNonMemeType(fileTache));
		
		PaireHomogène2<Personne> ph = new PaireHomogène2<>(p1, p2);
		
		PaireHomogène<Personne> paireh = new PaireHomogène<>(p1, p2);
		
		EntreeAgenda<Date,String> agenda1 = new EntreeAgenda<>(new Date(), "agenda 1");
		
		BouteilleEtiquetee<String> be = new BouteilleEtiquetee<>("bouteille1", "étiquette1");
		
		EtiquetteBouteille etiquette2 = new EtiquetteBouteille(12, "nomProducteur", "adresse", "descriptif", 120);
		
		BouteilleEtiquetee<EtiquetteBouteille> bee = new BouteilleEtiquetee<>("bouteille2", etiquette2);

	}

}

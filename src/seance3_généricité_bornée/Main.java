package seance3_généricité_bornée;

public class Main {

	public static void main(String[] args) {
		Rayon<Livre> rayonLivre = new Rayon<>();
		Rayon<Produit> rayonProduit = new Rayon<>();
		
		Produit pLait = new Produit("lait");
		Produit pCookie = new Produit("cookie");
		Livre livre1 = new Livre("livre1");
		Livre livre2 = new Livre("livre2");
		
		rayonProduit.ajouterProduit(pLait);
		rayonProduit.ajouterProduit(pCookie);
		System.out.println(rayonProduit.listingContenu());
		
		rayonLivre.ajouterProduit(livre1);
		rayonLivre.ajouterProduit(livre2);
		System.out.println(rayonLivre.listingContenu());
		
//		On ne peut pas écrire les deux instructions ci-dessous 
//		FileAttente<Personne> fp = new FileAttente<Adulte>(); // Adulte extends Personne, mais Personne n'est pas focement Adulte.
//		FileAttente<Adulte> fa = new FileAttente<Enfant>(); // Adulte et Enfant ne sont pas la même classe.

		FileAttente<Enfant> f1 = new FileAttente<>();
		FileAttente<Adulte> f2 = new FileAttente<>();
		FileAttente<Personne> f3 = new FileAttente<>();
		
		Personne p1 = new Personne("p1");
		Adulte a1 = new Adulte("a1");
		Enfant e1 = new Enfant("e1");
		
		f3.entre(e1);
		f1.entre(e1);
		
		System.out.print(FileAttente.compareStaticMemeType(f1, f3));
	}

}

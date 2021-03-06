package seance5_streamsIterateurs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class DirectionLycee implements Iterable<EmployeLycee> {
	private EmployeLycee proviseur,
						proviseurAdjoint,
						conseillerPrincipaldEducation,
						gestionnaire,
						chefDeTravaux;

	public DirectionLycee() {
	}

	public EmployeLycee getProviseur() {
		return proviseur;
	}

	public void setProviseur(EmployeLycee proviseur) {
		this.proviseur = proviseur;
	}

	public EmployeLycee getProviseurAdjoint() {
		return proviseurAdjoint;
	}

	public void setProviseurAdjoint(EmployeLycee proviseurAdjoint) {
		this.proviseurAdjoint = proviseurAdjoint;
	}

	public EmployeLycee getConseillerPrincipaldEducation() {
		return conseillerPrincipaldEducation;
	}

	public void setConseillerPrincipaldEducation(EmployeLycee conseillerPrincipaldEducation) {
		this.conseillerPrincipaldEducation = conseillerPrincipaldEducation;
	}

	public EmployeLycee getGestionnaire() {
		return gestionnaire;
	}

	public void setGestionnaire(EmployeLycee gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	public EmployeLycee getChefDeTravaux() {
		return chefDeTravaux;
	}

	public void setChefDeTravaux(EmployeLycee chefDeTravaux) {
		this.chefDeTravaux = chefDeTravaux;
	}
	
	public String toString() {
		String res ="Direction du lycee "
				+"\nproviseur "+this.getProviseur()
				+"\nproviseur adjoint "+this.getProviseurAdjoint()	
				+"\ngestionnaire "+this.getGestionnaire()		
				+"\nCPE "+this.getConseillerPrincipaldEducation()	
				+"\nChef de travaux "+this.getChefDeTravaux();
		return res;
	}
	
	public int ageMoyen() {
		 return (this.getProviseur().getAge()+
				this.getProviseurAdjoint().getAge()+
				this.getConseillerPrincipaldEducation().getAge()+
				this.getGestionnaire().getAge()+
				this.getChefDeTravaux().getAge())/5;
	}
		
	// Methode qui affiche les noms des employ??s sur la sortie standard 
	public void afficheNoms() {
		System.out.println(this.getProviseur().getNom()+", "+
		this.getProviseurAdjoint().getNom()+", "+
		this.getConseillerPrincipaldEducation().getNom()+", "+
		this.getGestionnaire().getNom()+", "+
		this.getChefDeTravaux().getNom());
	}
	
	// Methode qui retourne la liste des employes recrutes 
	// apres une certaine annee passee en parametre
	public ArrayList<EmployeLycee> recruteApres(int annee) {
		ArrayList<EmployeLycee> listRecruteApres = new ArrayList<>();
		if (this.getProviseur().getAnneeRecrutement() > annee) {
			listRecruteApres.add(this.proviseur);
		}
		if (this.getProviseurAdjoint().getAnneeRecrutement() > annee) {
			listRecruteApres.add(this.proviseurAdjoint);
		}
		if (this.getConseillerPrincipaldEducation().getAnneeRecrutement() > annee) {
			listRecruteApres.add(this.conseillerPrincipaldEducation);
		}
		if (this.getGestionnaire().getAnneeRecrutement() > annee) {
			listRecruteApres.add(this.gestionnaire);
		}
		if (this.getChefDeTravaux().getAnneeRecrutement() > annee) {
			listRecruteApres.add(this.chefDeTravaux);
		}
		return listRecruteApres;
	}

	// Methode qui retourne l'age moyen 
	// des membres d'une certaine categorie recrutes
	// avant une certaine annee	
	public double ageMoyenCategorieAvant(Categorie a, int annee)
	{
		int ageTotal = 0;
		int nb = 0;
		if (this.getProviseur().getCategorie() == a && this.getProviseur().getAnneeRecrutement() < annee) {
			ageTotal += this.getProviseur().getAge();
			nb++;
		}
		if (this.getProviseurAdjoint().getCategorie() == a && this.getProviseurAdjoint().getAnneeRecrutement() < annee) {
			ageTotal += this.getProviseurAdjoint().getAge();
			nb++;
		}
		if (this.getConseillerPrincipaldEducation().getCategorie() == a && this.getConseillerPrincipaldEducation().getAnneeRecrutement() < annee) {
			ageTotal += this.getConseillerPrincipaldEducation().getAge();
			nb++;
		}
		if (this.getGestionnaire().getCategorie() == a && this.getGestionnaire().getAnneeRecrutement() < annee) {
			ageTotal += this.getGestionnaire().getAge();
			nb++;
		}
		if (this.getChefDeTravaux().getCategorie() == a && this.getChefDeTravaux().getAnneeRecrutement() < annee) {
			ageTotal += this.getChefDeTravaux().getAge();
			nb++;
		}
		if (nb > 0) {
			return ageTotal/nb;	
		} else {
			return 0;
		}
			
	}
	
	// Methode qui retourne l'annee de recrutement
	// la plus ancienne pour les employes 
	// d'un certain corps
	public int anneeRecrutementPlusAnciennePourCorps(String corps)
	{		
		ArrayList<Integer> listAnneeRecrutement = new ArrayList<>();
		if (this.getProviseur().getCorps() == corps) {
			listAnneeRecrutement.add(this.getProviseur().getAnneeRecrutement());
		}
		if (this.getProviseurAdjoint().getCorps() == corps) {
			listAnneeRecrutement.add(this.getProviseurAdjoint().getAnneeRecrutement());
		}
		if (this.getConseillerPrincipaldEducation().getCorps() == corps) {
			listAnneeRecrutement.add(this.getConseillerPrincipaldEducation().getAnneeRecrutement());
		}
		if (this.getGestionnaire().getCorps() == corps) {
			listAnneeRecrutement.add(this.getGestionnaire().getAnneeRecrutement());
		}
		if (this.getChefDeTravaux().getCorps() == corps) {
			listAnneeRecrutement.add(this.getChefDeTravaux().getAnneeRecrutement());
		}
        int anneeRecrutementPlusAncienne = Collections.min(listAnneeRecrutement);
		return anneeRecrutementPlusAncienne;		
	}

	@Override
	public Iterator<EmployeLycee> iterator() {
		return new IteratorDirectionLycee(this);
	}
	//********* ITERATEUR ******************
	// Apr??s avoir ??crit l'it??rateur et avoir transform?? la
	// classe DirectionLycee en classe Iterable ...
	public int ageMoyenIte() {
		int ageTotal = 0;
		int nb = 0;
		Iterator<EmployeLycee> ite = this.iterator();
		while (ite.hasNext()) {
			ageTotal += ite.next().getAge();
			nb++;
		}
		if (nb > 0) {
			return ageTotal/nb;	
		} else {
			return 0;
		}
		
	}
			
	// Ecrire afficheNoms avec for (quand l'iterateur existe)
	public void afficheNomsIte() {
//	boucle for, java transcrire vers Iterator<EmployeLycee> ite = this.iterator(); while ... quand compilsation
		for (EmployeLycee e : this) {
			System.out.println(e.getNom());
		}
	}
		
	// Ecrire recruteApres avec for (quand l'iterateur existe)
	public ArrayList<EmployeLycee> recruteApresIte(int annee) {
		ArrayList<EmployeLycee> listRecruteApres = new ArrayList<>();
		for (EmployeLycee e : this) {
			if (e.getAnneeRecrutement() > annee) {
				listRecruteApres.add(e);
			}
		}
		return listRecruteApres;
	}
		
	// Ecrire ageMoyenCategorieAvant avec for (quand l'iterateur existe)
	public double ageMoyenCategorieAvantIte(Categorie a, int annee) {
		int ageTotal = 0;
		int nb = 0;
		for (EmployeLycee e : this) {
			if (e.getCategorie() == a && e.getAnneeRecrutement() < annee) {
				ageTotal += e.getAge();
				nb++;
			}
		}
		return ageTotal/nb;
	}
	
	// Ecrire anneeRecrutementPlusAnciennePourCorps avec for (quand l'iterateur existe)
	public int anneeRecrutementPlusAnciennePourCorpsIte(String corps) {
		ArrayList<Integer> list = new ArrayList<>();
		for (EmployeLycee e : this) {
			if (e.getCorps() == corps) {
				list.add(e.getAnneeRecrutement());
			}
		}
		int plusAncien = Collections.min(list);
		return plusAncien;
	}
	
	public ArrayList<EmployeLycee> membres() {
		ArrayList<EmployeLycee> membres = new ArrayList<>();
		membres.add(this.getProviseur());
		membres.add(this.getProviseurAdjoint());
		membres.add(this.getConseillerPrincipaldEducation());
		membres.add(this.getGestionnaire());
		membres.add(this.getChefDeTravaux());
		return membres;
	}
//	public ArrayList<EmployeLycee> membreVide() {
//		ArrayList<EmployeLycee> membreVide = new ArrayList<>();
//		return membreVide;
//	}
	
	// ??gale .stream() sur list
	public Stream<EmployeLycee> streamMembres() {
		Iterator<EmployeLycee> ite = new IteratorDirectionLycee(this);
		return iteratorVersStreamSequentiel(ite);
	}
	
	public static<T> Stream<T> iteratorVersStreamSequentiel(Iterator<T> ite) {
		Spliterator<T> spitr = Spliterators.spliteratorUnknownSize(ite, Spliterator.NONNULL);
		return StreamSupport.stream(spitr, false);
	}
	
	// fa??on membres().stream() qui return Stream<EmployeLycee>
	public double ageMoyenStream() {
		return this.membres()
			.stream()
			.mapToDouble(e -> e.getAge())
			.average()
			.getAsDouble(); // error : no value present, si list vide
	}
	
	// fa??on Stream<EmployeLycee> streamMembres()
	public double ageMoyenStreamMembres() {
		return this.streamMembres()
			.mapToDouble(e -> e.getAge())
			.average()
			.getAsDouble();
	}
	
	// fa??on membres().stream() qui return Stream<EmployeLycee>
	public void afficheNomsStream() {
		this.membres()
			.stream()
			.forEach(e -> System.out.println(e.getNom()));
	}
	
	// fa??on Stream<EmployeLycee> streamMembres()
	public void afficheNomsStreamMembres() {
		this.streamMembres()
			.forEach(e -> System.out.println(e.getNom()));
	}
	
	// fa??on membres().stream() qui return Stream<EmployeLycee>
	public ArrayList<EmployeLycee> recruteApresStream(int annee) {
		ArrayList<EmployeLycee> list = new ArrayList<>();
		this.membres()
			.stream()
			.filter(e -> e.getAnneeRecrutement() > annee)
			.forEach(e -> {list.add(e);});
		return list;
	}
	
	// fa??on Stream<EmployeLycee> streamMembres()
	public ArrayList<EmployeLycee> recruteApresStreamMembres(int annee) {
		ArrayList<EmployeLycee> list = new ArrayList<>();
		this.streamMembres()
			.filter(e -> e.getAnneeRecrutement() > annee)
			.forEach(e -> {list.add(e);});
		return list;
	}
	
	// fa??on membres().stream() qui return Stream<EmployeLycee>
	public double ageMoyenCategorieAvantStream(Categorie cat, int annee) {
		return this.membres()
				.stream()
				.filter(e -> e.getCategorie() == cat && e.getAnneeRecrutement() < annee)
				.mapToDouble(e -> e.getAge())
				.average()
				.getAsDouble();
	}
	
	// fa??on Stream<EmployeLycee> streamMembres()
	public double ageMoyenCategorieAvantStreamMembres(Categorie cat, int annee) {
		return this.streamMembres()
				.filter(e -> e.getCategorie() == cat && e.getAnneeRecrutement() < annee)
				.mapToDouble(e -> e.getAge())
				.average()
				.getAsDouble();
	}
	
	// fa??on membres().stream() qui return Stream<EmployeLycee>
	public int anneeRecrutementPlusAnciennePourCorpsStream(String corps) {
		return this.membres()
				.stream()
				.filter(e -> e.getCorps() == corps)
				.mapToInt(e -> e.getAnneeRecrutement())
				.min()
				.getAsInt();
	}
	
	// fa??on Stream<EmployeLycee> streamMembres()
	public int anneeRecrutementPlusAnciennePourCorpsStreamMembres(String corps) {
		return this.streamMembres()
				.filter(e -> e.getCorps() == corps)
				.mapToInt(e -> e.getAnneeRecrutement())
				.min()
				.getAsInt();
	}
}
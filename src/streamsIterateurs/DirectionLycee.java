package streamsIterateurs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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
		
	// Methode qui affiche les noms des employés sur la sortie standard 
	
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

	// Après avoir écrit l'itérateur et avoir transformé la
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
//	boucle for, java transcrire vers Iterator<EmployeLycee> ite = this.iterator(); while ... quand complication
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
		
}

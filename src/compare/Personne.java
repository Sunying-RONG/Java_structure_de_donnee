package compare;

public class Personne implements Comparable<Personne> {
	String nom;
	int age;
	public Personne(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Personne p) {
		return this.getNom().compareTo(p.getNom());
	}
	
}

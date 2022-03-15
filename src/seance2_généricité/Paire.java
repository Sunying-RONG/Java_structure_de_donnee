package seance2_généricité;

public class Paire<A,B> {
	private A fst;
	private B snd;
	
	public Paire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Paire(A fst, B snd) {
		super();
		this.fst = fst;
		this.snd = snd;
	}
	public A getFst() {
		return fst;
	}
	public void setFst(A fst) {
		this.fst = fst;
	}
	public B getSnd() {
		return snd;
	}
	public void setSnd(B snd) {
		this.snd = snd;
	}
	@Override
	public String toString() {
		return "Paire [fst=" + fst + ", snd=" + snd + "]";
	}
	
	public static<X,Y> void copieFstTab (Paire<X,Y> p, X[] tableau, int i) {
		if (i >=0 && i <tableau.length)
		tableau[i]=p.getFst();
	}
	
	public <C> boolean memeFst(Paire<A,C> p) {
		return p.getFst().equals(this.getFst());
	}
}

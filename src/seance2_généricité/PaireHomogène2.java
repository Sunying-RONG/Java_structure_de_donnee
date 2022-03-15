package seance2_généricité;

public class PaireHomogène2<A> {
	private A fst;
	private A snd;
	
	public PaireHomogène2() {
	}
	
	public PaireHomogène2(A a, A b) {
		fst = a;
		snd = b;
	}
	
	public A getFst() {
		return fst;
	}
	
	public A getSnd() {
		return snd;
	}
	
	public void setFst(A a) {
		fst = a;
	}
	
	public void setSnd(A b) {
		snd = b;
	}
	
	public String toString() {
		return getFst() + "-" + getSnd();
	}
	
}

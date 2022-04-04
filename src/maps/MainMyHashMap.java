package maps;

public class MainMyHashMap {

	public static void main(String[] args) {
		
		Departement H = new Departement(
				"Hérault","34",6224,"Montpellier",1444892,342);
		Departement I = new Departement(
				"Ille et Vilaine","35",6775,"Rennes",1060199,333);
		Departement HL = new Departement(
				"Haute Loire","43",4977,"Le Puy en Velay",227283,257);
		Departement CS = new Departement(
				"Corse-du-Sud","2A",4014,"Sartène",157249,124);
		Departement HC = new Departement(
				"Haute-Corse","2B",4666,"Sartène",177689,236);
		Departement HG = new Departement(
				"Haut-Garonne","31",6309,"Toulouse",1362672,587);
		Departement G = new Departement(
				"Gers","32",6257,"Auch",191091,462);
		Departement Gi = new Departement(
				"Gironde","33",9975,"Bordeaux",1583384,535);
		Departement Ga = new Departement(
				"Gard","30",5853,"Nîmes",744178,351);
		Departement Au = new Departement(
				"Aube","10",6004,"Troyes",310020,431);
		Departement Ma = new Departement(
				"Marne","51",8169,"Châlons-en-Champagne",568895,616);
		
		MyEntry<String,Departement> e1 = new MyEntry<>("34",H);
		MyEntry<String,Departement> e2 = new MyEntry<>("35",I);
		
		MyHashMap<String,Departement> mhm = new MyHashMap<>();
		System.out.println(mhm);
		System.out.println("Hashcode de 34 ="+new String("34").hashCode()%10);
		mhm.put("34", H);
		System.out.println(mhm);
		System.out.println("Hashcode de 35 ="+new String("35").hashCode()%10);
		mhm.put("35", I);
		System.out.println(mhm);
		System.out.println("Hashcode de 43 ="+new String("43").hashCode()%10);
		mhm.put("43", HL);
		System.out.println(mhm);
		System.out.println("Hashcode de 2A ="+new String("2A").hashCode()%10);
		mhm.put("2A", CS);
		System.out.println(mhm);
		System.out.println("Hashcode de 2B ="+new String("2B").hashCode()%10);
		mhm.put("2B", HC);
		System.out.println(mhm);
		System.out.println("Hashcode de 31 ="+new String("31").hashCode()%10);
		mhm.put("31", HG);
		System.out.println(mhm);
		System.out.println("Hashcode de 32 ="+new String("32").hashCode()%10);
		mhm.put("32", G);
		System.out.println(mhm);
		System.out.println("Hashcode de 33 ="+new String("33").hashCode()%10);
		mhm.put("33", Gi);
		System.out.println(mhm);
		System.out.println("Hashcode de 30 ="+new String("30").hashCode()%10);
		mhm.put("30", Ga);
		System.out.println(mhm);
		System.out.println("Hashcode de 10 ="+new String("10").hashCode()%10);
		mhm.put("10", Au);
		System.out.println(mhm);
		System.out.println("Hashcode de 51 ="+new String("51").hashCode()%10);
		mhm.put("51", Ma);			
		System.out.println(mhm);	
		
		System.out.println("Hashcode de 34 ="+new String("34").hashCode()%20);
		System.out.println("Hashcode de 35 ="+new String("35").hashCode()%20);
		System.out.println("Hashcode de 43 ="+new String("43").hashCode()%20);
		System.out.println("Hashcode de 2A ="+new String("2A").hashCode()%20);
		System.out.println("Hashcode de 2B ="+new String("2B").hashCode()%20);
		System.out.println("Hashcode de 31 ="+new String("31").hashCode()%20);
		System.out.println("Hashcode de 32 ="+new String("32").hashCode()%20);
		System.out.println("Hashcode de 33 ="+new String("33").hashCode()%20);
		System.out.println("Hashcode de 30 ="+new String("30").hashCode()%20);
		System.out.println("Hashcode de 10 ="+new String("10").hashCode()%20);
		System.out.println("Hashcode de 51 ="+new String("51").hashCode()%20);
		
		System.out.println(mhm.get("34"));
		System.out.println(mhm.get("35"));
		System.out.println(mhm.get("43"));
		System.out.println(mhm.get("2A"));
		System.out.println(mhm.get("2B"));
		System.out.println(mhm.get("31"));
		System.out.println(mhm.get("32"));
		System.out.println(mhm.get("33"));	
		System.out.println(mhm.get("30"));	
		System.out.println(mhm.get("10"));
		System.out.println(mhm.get("51"));	
		
		// TESTER ICI 
		
		// la méthode size() et la méthode isEmpty()
		System.out.println(mhm.size());
		System.out.println(mhm.isEmpty());
		// la méthode keySet
		System.out.println(mhm.keySet());
		// la méthode toString
		System.out.println(mhm);
	}
}

/*
*-----------
* MyTreeMap
*-----------
* Version simplifiée imitant la classe de l'API Java - notamment l'équilibrage n'est pas traité
*-----------
* Elle est incomplète et destinée à êêtre complétée par vos soins.
*-----------
* Vous ferez un Fork sur ce code puis vous m'invitez dessus pour que je puisse vous aider à avancer.
*-----------
* Le code ci-dessous s'exécute et appelle les fonctions à tester, dont certaines ne sont pas encore écrites et retournent des valeurs par défaut
*-----------
*/

// 

package tree_maps;

// Prefixe --> keysetprefixe
// 32 (g) 2A (g) 10 (d) 2B 30 (remonte) 43 34 51
// concaténer :
// la clef de la racine
// l'ordre préfixe des clefs du sous-arbre gauche
// l'ordre préfixe des clefs du sous-arbre droit


// Infixe -- > keyset
// (g) racine (d)
// 10 2A 30 2B 32 34 43 51
//concaténer :
//l'ordre préfixe des clefs du sous-arbre gauche
//la clef de la racine
//l'ordre préfixe des clefs du sous-arbre droit

// exemple plus facile à comprendre
// arbre d'une expression arithmétique
// 12 + (3 * 4)
// de manière indentée
/*
 
 +  (opérateur principal de l'expression)
   12 (premier opérande)
   * (opérateur du second oprande du +)
      3
      4
 parcours préfixe:
  + 12 * 3 4
 pour représenter + (12 *(3 4))
 parcours infixe :
 12 + 3 * 4
 12 (gauche)
 + clef de la racine
 3 (gauche du *)
 * clef de la racine du sous-arbre droit
 4 (droite du *)
 */

/*
 * 
 *  32
    2A
      10
        .
        .
      2B
        .
        30
          .
          .
    43
      34
        .
        .
      51
        .
        .
 */


public class MainMyTreeMap {

	public static void main(String[] args) {
		
		Departement H = new Departement(
				"Hérault","34",6224,"Montpellier",1444892,342);
		Departement HL = new Departement(
				"Haute Loire","43",4977,"Le Puy en Velay",227283,257);
		Departement CS = new Departement(
				"Corse-du-Sud","2A",4014,"Sartène",157249,124);
		Departement HC = new Departement(
				"Haute-Corse","2B",4666,"Sartène",177689,236);
		Departement G = new Departement(
				"Gers","32",6257,"Auch",191091,462);
		Departement Ga = new Departement(
				"Gard","30",5853,"Nîmes",744178,351);
		Departement Au = new Departement(
				"Aube","10",6004,"Troyes",310020,431);
		Departement Ma = new Departement(
				"Marne","51",8169,"Châlons-en-Champagne",568895,616);
		Departement test = new Departement(
				"test","00",8169,"Châlons-en-Champagne",568895,616);
		
		System.out.println("\n---------------");
		
		MyTreeMap<String,Departement> mhm = new MyTreeMap<>();
		System.out.println(mhm+"\n---------------");
		
		mhm.put("32", G);
		System.out.println(mhm+"\n---------------");
		
		mhm.put("43", HL);
		System.out.println(mhm+"\n---------------");

		mhm.put("2A", CS);
		System.out.println(mhm+"\n---------------");

		mhm.put("2B", HC);
		System.out.println(mhm+"\n---------------");
		
		mhm.put("10", Au);
		System.out.println(mhm+"\n---------------");
		
		mhm.put("30", Ga);
		System.out.println(mhm+"\n---------------");

		mhm.put("34", H);
		System.out.println(mhm+"\n---------------");

		mhm.put("51", Ma);
		System.out.println(mhm+"\n---------------");	
		
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
	 
		System.out.println(mhm.keySet());		
		System.out.println(mhm.keySetPrefixe());
		
		System.out.println(mhm.nbFeuilles());		
		System.out.println(mhm.containsKey("35"));	
		System.out.println(mhm.containsValue(H));
		System.out.println(mhm.containsValue(test));
	}
}

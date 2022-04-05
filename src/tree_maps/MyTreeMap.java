package tree_maps;

import java.util.*;

// K extends Comparable<K> permettra de disposer d'une
// fonction naturelle de comparaison sur les clefs
// de la forme : int compareTo(K autreClef)
// elle retourne 0 si égal
// -1 si this inférieur à autreClef
// +1 si this supérieur à autreClef

public class MyTreeMap<K extends Comparable<K>, V> 
		implements Map<K, V> {
	
	private MyNodeEntry<K,V> root;
	private int nbNodes;
	
	public MyTreeMap() {}
	
	@Override
	public int size() {
		return this.nbNodes;
	}

	@Override
	public boolean isEmpty() {
		return this.size()==0;
	}

	// version d'ajout simplifiée ne rééquilibrant pas l'arbre
	// On respecte la propriété d'organisation des clefs qui dit
	// qu'à partir de la racine :
	// - toute clef de la branche GAUCHE d’un noeud est toujours INFERIEURE 
	//    à la clef du noeud lui-même.  
	// - toute clef de la branche DROITE d’un noeud est toujours SUPERIEURE 
	//    à la clef du noeud lui-même.  
	// 
	
	@Override
	public V put(K key, V value) {
		// si l'arbre est vide, on crée une racine
		if (this.isEmpty())
		{
			root = new MyNodeEntry<>(key, value, null);
			this.nbNodes++;
			return value;
		}
		// sinon on cherche l'emplacement 
		// adapté à la nouvelle valeur
		// en respectant la propriété d'organisation des clefs
		int cmp;
		MyNodeEntry<K,V> courant, parent;
		courant = root;
		do {			  
			  parent = courant;
			  cmp = key.compareTo(courant.key);
			  if (cmp < 0)
			  	courant = courant.left;
			  else if (cmp > 0)
				 courant = courant.right;
			  else // la clef est déjà dedans 
				   // on change simplement la valeur associée
				  {
				  	courant.setValue(value);
				  	return value;
				  }
		}
		while (courant != null);
		// si on arrive ici il faut insérer à gauche ou à droite
		MyNodeEntry<K,V> e = new MyNodeEntry<>(key, value, parent);
		if (cmp < 0)
		 	parent.left = e;
		else
			parent.right = e;
		this.nbNodes++;
		return null;
	}
	
	// affichage indenté de l'arbre

	@Override
	public String toString() {
		if (! this.isEmpty())
			return root.toStringRec("  ");
		else 
			return ".";
	}
	
	// Méthodes à implémenter
	
	// On appelle une méthode récursive écrite dans
	// MyNodeEntry
	// qu'il faudra écrire
	
	@Override
	public V get(Object key) {
		return this.root.get((K)key);
	}

	// Méthode à écrire
	// façon itéraire
	@Override
	public boolean containsKey(Object key) {
		MyNodeEntry<K,V> courant;
		if (this.isEmpty()) {
			return false;
		} else {
			courant = root;
			do {
				if (((Comparable<K>) key).compareTo(courant.key) == 0) {
					return true;
				} else if (((Comparable<K>) key).compareTo(courant.key) > 0) {
					courant = courant.right;
				} else {
					courant = courant.left;
				}
			} while (courant != null);
		}
		return false;
	}
	
	// Méthode à écrire
	// façon récursive
	@Override
	public boolean containsValue(Object value) {
		return root.checkValue(value);
	}
	
	// Méthode qui appelle une méthode récursive écrite dans
	// MyNodeEntry
	// qu'il faudra écrire
	@Override
	public Set<K> keySet() {
		// pas ordre, affichage string ordre naturel
		Set<K> res = new TreeSet<>();
		this.root.keySet(res);
		return res;
	}
	
	// Méthode qui appelle une méthode récursive écrite dans
	// MyNodeEntry
	// qu'il faudra écrire	
	public ArrayList<K> keySetPrefixe() {
		ArrayList<K> res = new ArrayList<>();
		this.root.keySetPrefixe(res);
		return res;
	}	
	
	// une feuille est un noeud qui n'a 
	// ni fils gauche
	// ni fils droit
	// Méthode qui appelle une méthode récursive écrite dans
	// MyNodeEntry
	public int nbFeuilles() {
		return this.root.nbFeuilles();
	}

		
	// méthodes que vous pouvez ne pas écrire

	@Override
	public Collection<V> values() {
		return null;
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		return null;
	}


	@Override
	public V remove(Object key) {
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
	}

	@Override
	public void clear() {
	}

	

}

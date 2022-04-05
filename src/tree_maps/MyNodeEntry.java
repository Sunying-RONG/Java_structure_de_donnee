package tree_maps;

import java.util.*;

public class MyNodeEntry<K extends Comparable<K>,V> extends MyEntry<K,V> {
	MyNodeEntry<K,V> left = null;
	MyNodeEntry<K,V> right = null;
	MyNodeEntry<K,V> parent;
	
	public MyNodeEntry(K key, V value, MyNodeEntry<K,V> parent) {
		super(key,value);
		this.parent=parent;
	}
	
	// écriture récursive de la méthode auxiliaire
	// appelée dans toString() de MyTreeMap
	
	public String toStringRec(String decalage) {
		String res = decalage+this.key.toString()+"\n";
		if (this.left != null)
				res += this.left.toStringRec(decalage+"  ");
		else res+= decalage+"  "+"."+"\n";
		if (this.right != null)
				res += this.right.toStringRec(decalage+"  ");
		else res+= decalage+"  "+"."+"\n";
		return res;
	}
	
	// méthodes demandées
	
	// écriture récursive de la méthode auxiliaire appelée 
	// par V get(K key) de MyTreeMap
	// de recherche d'une clef afin de retourner la valeur associée
	
	public V get(K key) {
		// si la clef est égale à key
		// retourner la valeur associée
		if (key.compareTo(this.getKey()) == 0) {
			return this.getValue();
		}
		// si la clef de la racine est supérieure à la clef cherchée
		// on appelle get sur le sous-arbre gauche
		if (key.compareTo(this.getKey()) < 0) {
			if (this.left != null) {
				return this.left.get(key);
			} else {
				return null;
			}
		}
		// si la clef de la racine est supérieure à la clef cherchée
		// on appelle get sur le sous-arbre droite
		if (key.compareTo(this.getKey()) > 0) {
			if (this.right != null) {
				return this.right.get(key);
			} else {
				return null;
			}
		}
		return null;
	}
	
	public void keySet(Set<K> res) {
		// à écrire
		res.add(getKey());
		if (this.left != null) {
			this.left.keySet(res);
		}
		if (this.right != null) {
			this.right.keySet(res);
		}
	}
	
	public void keySetPrefixe(ArrayList<K> res) {
		// à écrire
		res.add(getKey());
		if (this.left != null) {
			this.left.keySetPrefixe(res);
		}
		if (this.right != null) {
			this.right.keySetPrefixe(res);
		}
		
	}

	public int nbFeuilles() {
		// à écrire
		int nbFeuilles = 0;
		if (this.left == null && this.right == null) {
			nbFeuilles++;
		}
		if (this.left != null) {
			nbFeuilles += this.left.nbFeuilles();
		}
		if (this.right != null) {
			nbFeuilles += this.right.nbFeuilles();
		}
		return nbFeuilles;
	}
	
	public boolean checkValue(Object value) {
		if (this.getValue().equals(value)) {
			return true;
		} 
		
		if (this.left != null && this.right != null) {
			if (this.left.checkValue(value) || this.right.checkValue(value)) {
				return true;
			} else {
				return false;
			}
		}
		
		if (this.left == null && this.right == null) {
			return false;
		}
		
		if (this.left == null && this.right != null) {
			if (this.right.checkValue(value)) {
				return true;
			} else {
				return false;
			}
		}
		
		if (this.left != null && this.right == null) {
			if (this.left.checkValue(value)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}

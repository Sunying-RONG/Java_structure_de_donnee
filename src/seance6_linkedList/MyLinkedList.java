package seance6_linkedList;

import java.util.*;

public class MyLinkedList <E>
       extends AbstractSequentialList<E>
       implements List<E>
{
	private int size = 0; 
       /**
        * Pointer to first node.
        * Invariant: (first == null && last == null) ||
        *            (first.prev == null && first.item != null)
        */
	private MyNode<E> first=null;
       /**
        * Pointer to last node.
        * Invariant: (first == null && last == null) ||
        *            (last.next == null && last.item != null)
        */
	private MyNode<E> last=null;

	public MyLinkedList() {} 
	
	// une liste vide est telle que first == null && last == null
	@Override   
	public boolean isEmpty() {
		// TODO
		if (first == null && last == null) {
			return true;
		} else {
			return false;
		}
	}
	
	// ajout à la fin de la chaîne
	@Override 
	public boolean add(E element) {
		// TODO
		MyNode<E> newNode = new MyNode<E>(null, element, null);
		if (this.isEmpty()) {
			this.first = newNode;
			this.last = newNode;
		} else {
			this.last.next = newNode;
			newNode.prev = this.last;
			this.last = newNode;
		}
		return true;
	}
	
	// cherche si l'élément est dans la liste
	@Override 
	public boolean contains(Object element) {
		// TODO
		MyNode<E> courant = this.first;
		while (courant != null) {
			if (courant.item.equals(element)) {
				return true;
			}
			courant = courant.next;
		}
		return false;
	}
	
	@Override
	public int size() {
		// TODO
		int nb = 0;
		MyNode<E> courant = this.first;
		while (courant != null) {
			nb++;
			courant = courant.next;
		}
		return nb;
	}
	
	@Override
	public E get(int i) {
		// TODO commence à 0
		E e = null;
		if (this.size() > 0 && i < this.size()) {
			MyNode<E> courant = this.first;
			for (int index = 0; index <= i; index++) {
				if (index == i) {
					e = courant.item;
				}
				courant = courant.next;
			}
		}
		return e;
	}
	
	@Override
	public String toString() {
		// TODO
		String t = "";
		MyNode<E> courant = this.first;
		while (courant != null) {
			t += courant.item.toString();
			courant = courant.next;
		}
		return t;
	}	
	
	public String toStringInverse() {
		// TODO
		String ti = "";
		MyNode<E> courant = this.last;
		while (courant != null) {
			ti += courant.item.toString();
			courant = courant.prev;
		}
		return ti;
	}	
	
	// methode ecrite pour respecter l'interface mais que l'on ne va
	// pas implementer dans ce TP
	@Override
	public ListIterator<E> listIterator(int index) {
		throw new UnsupportedOperationException();
	}
	
	// méthodes plus difficiles pour les avancés :
	// ajout à une position i quelconque
	// retrait à une position i quelconque
}
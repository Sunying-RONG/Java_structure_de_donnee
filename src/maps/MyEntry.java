package maps;

public class MyEntry<K,V> {
	K key; // visibilité niveau package
	V value;
	
	public MyEntry(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public String toString() {
		return key+"-"+value;
	}
}

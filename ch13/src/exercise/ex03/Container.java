package exercise.ex03;

public class Container<T, V> {
	private T key;
	private V value;

	
	public T getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	
	public void set(T key, V value) {
		this.key = key;
		this.value = value;
	}
}

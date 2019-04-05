package sec07.exam08_generic_extends;

public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);
}

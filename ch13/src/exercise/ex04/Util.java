package exercise.ex04;

public class Util {
	public static <K,V> V getValue(Pair<K,V> p, K k) { //파라미터로 리턴값 지정
		if(p.getKey() == k) {
			return p.getValue();
		} else {
			return null;
		}
	}
}

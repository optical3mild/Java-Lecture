package sec07.exam16_default_method_extends_interface;

public interface ParentInterface {
	public void method1();
	
	public default void method2() {/*실행문*/}
}

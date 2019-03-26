package sec06.exam18_newInstance;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("sec06.exam18_newIntance.SendAction");
//			Class clazz = Class.forName("sec06.exam18_newIntance.ReceiveAction");
			
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}

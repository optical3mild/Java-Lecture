package sec05.exam24_nonSerializableParents;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Child extends Parent implements Serializable{
	public String field2;
	
	private void writeObject(ObjectOutputStream out) throws Exception {
		out.writeUTF(field1);
		out.defaultWriteObject();
	}
	
	private void readObject(ObjectInputStream in) throws Exception, ClassNotFoundException {
		field1 = in.readUTF();
		in.defaultReadObject();
	}
}

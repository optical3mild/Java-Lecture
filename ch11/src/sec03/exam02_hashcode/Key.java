package sec03.exam02_hashcode;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			Member member = (Member) obj;
//			if(id.equals(member.id)) {
//				return true;
//			}
//		}
//		return false;
//	}

	@Override
	public int hashCode() {
		return number;
	}
	
//	@Override
//	public int hashCode() {
//		return id.hashCode();
//	}
}

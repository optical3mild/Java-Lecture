package exercise.ex09;

public class StringBuilderExample {

	public static void main(String[] args) {
		String str = "";
		for(int i=1; i<=100; i++) {
			str += i;
		}
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder(); // 객체 생성, ():버퍼크기
		for(int i=1; i<=100; i++) {
			sb.append(i);					// 버퍼끝에 변수 i값 추가
			if(i!=100) {
				sb.append(" ");				// 조건에 따라 버퍼에 저장된 문자열의 끝에 공백 추가
			}
		}
		System.out.println(sb.toString());
	}

}

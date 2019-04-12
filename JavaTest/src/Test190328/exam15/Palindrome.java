package Test190328.exam15;

public class Palindrome {

	public static void main(String[] args) {
		
		int result = 0;
		
		for(int i=100; i<1000; i++) {
			for(int k=100; k<1000; k++) {
				int multi = i*k;
				if(isPalindrome(multi) && result<multi) {
					result = multi;
				}
			}
		}
		System.out.println("세자리수를 곱해 만들 수 있는 가장 큰 대칭수: " + result);
	}
	
	static boolean isPalindrome(int number) {
		String checkStr = String.valueOf(number);
		if((new StringBuffer(checkStr)).reverse().toString().equals(checkStr)) {
			return true;
		}
		return false;
	}

}

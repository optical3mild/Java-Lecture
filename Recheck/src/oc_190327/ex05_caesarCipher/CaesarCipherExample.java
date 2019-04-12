package oc_190327.ex05_caesarCipher;

import java.util.Scanner;

public class CaesarCipherExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요> ");
		String inStr = scan.nextLine();
		System.out.print("정수값을 입력하세요> ");
		int inNum = Integer.parseInt(scan.nextLine());
		scan.close();
		System.out.println();
		
		System.out.println("암호화된 문자열: " + CaesarCipher.encryptToCaesar(inStr, inNum));

	}

}

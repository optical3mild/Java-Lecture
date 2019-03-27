package oc_190327.ex02_dashInsert;

import java.util.Scanner;

public class DashInsertExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수를 입력하세요>");
		String input = scan.nextLine();
		scan.close();
		
		System.out.println("dashInsert() method: "+ DashInsert.dashInsert(input));
		System.out.println("dashInsertSb() method: "+ DashInsertStrBuilder.dashInsertSb(input));
	}
}

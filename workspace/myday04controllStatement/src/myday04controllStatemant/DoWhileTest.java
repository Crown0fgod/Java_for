package myday04controllStatemant;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		String message = "1.분실 신고\n 2.통신사 이동\n 3.번호 변경\n 0.상담사 연결";
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
//		while(true) {
//			System.out.println(message);
//			choice = sc.nextInt();
//			if(choice == 0) {break;}
//		}
		
//		while(choice != 0) {
//			System.out.println(message);
//			choice = sc.nextInt();
//		}
		
		do {
			System.out.println(message);
			choice = sc.nextInt();
		}while(choice != 0);
//		do ~ while을 쓰는거 자체가 망가진것
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

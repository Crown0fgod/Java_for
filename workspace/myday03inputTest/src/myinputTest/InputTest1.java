package myinputTest;

import java.util.Scanner;

public class InputTest1 {
	public static void main(String[] args) {
//		Ctrl + Shift + O = 자동 import 단축키
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : "); // 출력하기전 어떤 값을 입력해야될지 알려줌
		
//		sc.next(); // 입력상태
		
		System.out.println(sc.next()+ "님 반갑습니다."); // 알려준 값을 다음표기 처럼 출력함
						// 값		+	  문자열
		
		
		
		
		
	}
}

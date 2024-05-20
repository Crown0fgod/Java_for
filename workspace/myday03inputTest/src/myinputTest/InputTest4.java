package myinputTest;

import java.util.Scanner;

public class InputTest4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = null;
		
		System.out.print("이름 : ");
		
//		name = sc.next(); // name -> 저장공간
//		lastName = sc.next();
//		firstName = sc.next(); // sc.next();공백이 있으면 공백을 기준으로 앞에있는것만 출력
		
		name = sc.nextLine();
//		name = lastName + firstName; // 이름을 입력할때 성과 이름을 따로 쓸때 
		
		System.out.println(name + "님 반갑습니다.");
			
	}
}

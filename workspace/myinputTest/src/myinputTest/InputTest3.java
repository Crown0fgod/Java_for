package myinputTest;

import java.util.Scanner;

public class InputTest3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = null, firstName = null, lastName = null;
		
		System.out.print("이름 : ");
		
//		name = sc.next(); // name -> 저장공간
		lastName = sc.next();
		firstName = sc.next();
		
		name = lastName + firstName; // 이름을 입력할때 성과 이름을 따로 쓸때 
		
		System.out.println(name + "님 반갑습니다.");
			
	}
}

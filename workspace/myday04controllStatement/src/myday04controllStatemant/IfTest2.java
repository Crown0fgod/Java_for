package myday04controllStatemant;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0, result = 0;
		String message = "두 정수를 입력하세요.";
		String exampleMessage = "예)1 5";
		
		System.out.println(message);
		System.out.println(exampleMessage);
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		if(number1 > number2) {
			System.out.println("더 큰값 : " + number1);
		}
		
		else if(number1 < number2) {
			System.out.println("더 큰값 : " + number2);
		}
		
		else {
			System.out.println("두 값은 같습니다.");
		}
	
		
		
		
		
	}
}

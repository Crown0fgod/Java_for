package operTset;

import java.util.Scanner;

public class OperTest2 {
	public static void main(String[] args) {
//		삼항 연사자를 사용한 대소 비교
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0, result = 0;
		String message = "두 정수를 입력하세요.";
		String exampleMessage = "예)1 5";
		
		System.out.println(message);
		System.out.println(exampleMessage);
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		System.out.println(number1);
		System.out.println(number2);
				//조건식			   ?    1    :    5
		result = number1 > number2 ? number1 : number2;
		
		System.out.println("큰 값 : " + result);
		
		
		
		
		
		
		
		
		
		
	}
}

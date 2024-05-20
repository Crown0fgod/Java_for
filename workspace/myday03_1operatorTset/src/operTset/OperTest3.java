package operTset;

import java.util.Scanner;

public class OperTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0; 
		String result = null;
		String message = "두 정수를 입력하세요.";
		String exampleMessage = "예)1 5";
		
		System.out.println(message);
		System.out.println(exampleMessage);
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
					//처음 조건식     ? true일때 num1에서 끝
//								   ? false일때 밑에 있는 코드로 넘어감.
		result = number1 > number2 ?"더 큰 값 : " + number1 : 
			number1 == number2 ? "두 수는 같습니다." : "더 큰값 : " + number2;
		
		System.out.println(result);
	
		
		
		
		
		
		
	}
}

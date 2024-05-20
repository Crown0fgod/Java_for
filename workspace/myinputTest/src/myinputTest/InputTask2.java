package myinputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
//		두 정수를 입력한 뒤 덧셈 결과 출력
//		next()만 사용하기! nextInt() , nextDouble() 사용 금지!
		
//		int num1 = 0, num2 = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.printf("두 정수를 입력해주세요 : ",num1,num2);
//		
//		int num3 = num1 + num2;
//		sc.next();
//		System.out.println(Integer.parseInt("num1+num2")+num3);
//		
//		강사님께서 적은 코드
		
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0; // 첫번째와 두번째 정수를 담을 변수
		int result; // 두 정수의 덧셈 결과값 변수
		
		String message1 = "첫 번째 정수 : ", message2 = "두 번째 정수 : ";
		
//		출력할 메시지
		System.out.print(message1);
		number1 = Integer.parseInt(sc.next()); // 문자열인 것을 정수형으로 출력하는 소스
//		sc.next(); 는 문자열값이므로, Integer.parseInt를 사용해서 정수형으로 강제 형변환
		
		System.out.print(message2);
		number2 = Integer.parseInt(sc.next());
		
		result = number1 + number2;
		
		System.out.println("결과는 " + result + " 입니다");
		
		
		
		
	}
}

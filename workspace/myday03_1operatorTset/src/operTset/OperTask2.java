package operTset;

import java.util.Scanner;

public class OperTask2 {
	public static void main(String[] args) {
//		심리 테스트(번호로 입력받기) / 스캐너와 삼항 연산자 사용
//		Q. 당신이 좋아하는 색을 선택하세요.
//		1. 빨간색
//		2. 노란색
//		3. 검은색
//		4. 흰색
		
//		빨간색 : 불같고 열정적이고 적극적이다.
//		노란색 : 발랄하고 밝고 귀엽다 개성있고 착하다.
//		검은색 : 든든하고 냉철하고 멋지다.
//		흰색	 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
		
//		Scanner sc = new Scanner(System.in);
//		
//		String Q = "당신이 좋아하는 색을 선택하세요";
//		String num1 = "불같고 열정적이고 적극적이다.";
//		String num2 = "발랄하고 밝고 귀엽다 개성있고 착하다.";
//		String num3 = "든든하고 냉철하고 멋지다.";
//		String num4 = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
//		
//		
//		int num1 = 1, num2 = 2, num3 = 3, num4 = 4;
		
		System.out.println("------------------");
		
//		강사님께서 적은 코드
		
		String message = "Q. 당신이 좋아하는 색을 선택하세요.";
		String choiceMessage = " 1.빨간색\n 2.노란색\n 3.검은색\n 4.흰색\n";
		String redMessage = "불같고 열정적이고 적극적이다.";
		String yelloMessage = "발랄하고 밝고 귀엽다 개성있고 착하다.";
		String blackMessage = "든든하고 냉철하고 멋지다.";
		String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String erroMessage = "다시 입력해 주세요";
		
		int choice = 0;
		
		String result = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		System.out.println(choiceMessage);
		choice = sc.nextInt();
		
		
		result = choice == 1 ? redMessage 
				: choice == 2 ? yelloMessage 
						: choice == 3 ? blackMessage 
								: choice == 4 ? whiteMessage
										:erroMessage;
		
		System.out.println(result);
		
	}
}

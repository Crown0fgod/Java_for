package myday04controllStatemant;

import java.util.Scanner;

public class WhileTest2 {
	public static void main(String[] args) {
	
//		Q. 당신이 좋아하는 색을 선택하세요.
//		1. 빨간색
//		2. 노란색
//		3. 검은색
//		4. 흰색
		
//		빨간색 : 불같고 열정적이고 적극적이다.
//		노란색 : 발랄하고 밝고 귀엽다 개성있고 착하다.
//		검은색 : 든든하고 냉철하고 멋지다.
//		흰색	 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
			
		String message = "Q. 당신이 좋아하는 색을 선택하세요.";
		String choiceMessage = " 1.빨간색\n 2.노란색\n 3.검은색\n 4.흰색\n 5.나가기";
		String redMessage = "불같고 열정적이고 적극적이다.";
		String yelloMessage = "발랄하고 밝고 귀엽다 개성있고 착하다.";
		String blackMessage = "든든하고 냉철하고 멋지다.";
		String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String erroMessage = "다시 입력해 주세요";
		
		int choice = 0;
		
		String result = null;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		System.out.println(message);
		System.out.println(choiceMessage);
		choice = sc.nextInt();
		
		if(choice == 5) {break;}
		
		switch (choice) {
		case 1:
			result = redMessage;
			System.out.println("들어옴1");
			break;
		case 2:
			result = yelloMessage;
			System.out.println("들어옴2");
			break;
		case 3:
			result = blackMessage;
			System.out.println("들어옴3");
			break;
		case 4:
			result = whiteMessage;
			System.out.println("들어옴4");
			break;
		default:
			result = erroMessage;
			System.out.println("들어옴5");
			break;
		}
			
		System.out.println(result);
		
		}
	}
}

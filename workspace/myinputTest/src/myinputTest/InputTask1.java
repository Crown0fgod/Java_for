package myinputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//		이름,나이,사는곳,체중을 입력 받기
//		nextInt : 정수형
//		nextDouble : 실수형
		
//		Scanner sc = new Scanner(System.in);
//		String name = null;
//		int age = 0;
//		String live = null;
//		double weight = 0.0;
//		
//		System.out.println("이름,나이,사는곳,체중을 빈칸으로 구분하여 순서대로 입력하세요");	
//		
//		name = sc.next();
//		age = sc.nextInt();
//		live = sc.next();
//		weight = sc.nextDouble();
//		
//		System.out.println("당신의 이름은"+" "+ name +" "+ "입니다");
//		System.out.println("당신의 나이는"+" "+ age +" "+ "세입니다");
//		System.out.println("당신이 사는곳은"+" "+ live +" "+ "입니다");
//		System.out.println("당신의 체중은"+" "+ weight+" "+ "입니다");
//		System.out.println("이름 :" + name +" "+ "나이 :" + age+" " + 
//							"사는곳 :"+live+" "+ "체중 :"+weight+" ");
			
//		ex. 당신의 나이는 15세 입니다
//		서식문자, 제어문자 써보기
		System.out.println("------------------------------");
		
//		강사님께서 적은 코드
		
	//   이름, 나이, 사는 곳, 체중을 입력 받기
//      nextInt : 정수형
//      nextDouble : 실수형
   Scanner sc = new Scanner(System.in);
   String name = null, address = null;
   int age = 0;
   double weight = 0.0;
      
   System.out.println("이름, 사는 곳, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요");
      
   name = sc.next();
   address = sc.next();
   age = sc.nextInt();
   weight = sc.nextDouble();
   
//   서식문자, 제어문자 써보기
   
//   ex.   당신의 나이는 15세 입니다.
   System.out.printf("당신의 이름은 %s입니다.\n", name);
   System.out.printf("당신의 주소는 %s입니다.\n", address);
   System.out.printf("당신의 나이는 %d입니다.\n", age);
   System.out.printf("당신의 체중은 %.1f입니다.\n", weight);

		
		
	}
}

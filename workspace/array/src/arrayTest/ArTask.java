package arrayTest;

import java.util.Iterator;

public class ArTask {
	public static void main(String[] args) {
		
//	 1 ~ 10까지 배열에 담고 출력
		
//	int[] arData = new int[10];
//			
//	for (int i = 1; i < 10; i++) {
//		arData[10] = 10 - i;
//		System.out.println(arData[i]);
//	}
		
//	10 ~ 1까지 중 짝수만 배열에 담고 출력
		
		
//		System.out.println("-----------------");
		
	
//	강사님께서 적은 코드
	
//		 1 ~ 10까지 배열에 담고 출력
//		int[] arData = new int[10];
//		for (int i = 0; i < arData.length; i++) {
//		arData[i] = i + 1;
//		}
//	
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
//		
//		System.out.println("-----------------");
//		
//		10 ~ 1까지 중 짝수만 배열에 담고 출력
		
//		int[] arData1 = new int[5];
//		for (int i = 0; i < arData1.length; i++) {
//			arData1[i] = (5 - i) * 2;
//		}
//		
//		for (int i = 0; i < arData1.length; i++) {
//			System.out.println(arData1[i]);
//		}
		
		
//		1 ~ 100까지 배열에 담은 후 홀수만 출력
		
//		int[] arData = new int[30];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (30 - i) * 3;
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
//		1 ~ 100까지 배열에 담은 후 짝수의 합 출력
		
		
		
//		강사님께서 적은 코드
//		int[] arData = new int[100];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			if(i % 2 != 0) {continue;}
//			System.out.println(arData[i]);
//		}
		
//		System.out.println("-----------------");
		
//		int[] arData1 = new int[100];
//		int result = 0;
//		
//		for (int i = 0; i < arData1.length; i++) {
//			arData1[i] = i + 1;
//		}
//		
//		for (int i = 0; i < arData1.length; i++) {
//			if(i % 2 != 0) {
//				result += arData1[i];
//				System.out.println(arData1[i]);
//			}
//		}
//		
//		System.out.println("결과 값 : " + result);
		
		
//		A ~ F까지 배열에 담고 출력
		
//		char[] arData = new char[6];
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println((char)(i+65)); 
//		}
//		
//		System.out.println("-----------");
//		
//		A ~ F까지 배열중 C를 제외하고 배열에 담은 후 출력
//		
//		char[] arData1 = new char[5];
//		
//		for (int i = 0; i < arData1.length; i++) {
//			System.out.println((char)((i > 1 ? 66 : 65) + i));
//		}
//		
//		강사님께서 적은 코드
//		A ~ F까지 배열에 담고 출력
		
		char[] arData = new char[6];
		
		for (int i = 0; i < arData.length; i++) {
			arData[i] = (char)(65 + i);
		}
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
		System.out.println("-----------------");
		
//		A ~ F까지 배열중 C를 제외하고 배열에 담은 후 출력
		
		char[] arData1 = new char[6]; // 배열을 6칸으로 만든 소스
		
		for (int i = 0; i < arData1.length; i++) {
			arData1[i] = (char)(65 + i);
		}
		
		for (int i = 0; i < arData1.length; i++) {
			if(i == 2) {continue;}
			System.out.println(arData1[i]);
		}
		
		System.out.println("-----------------");
		
		char[] arData2 = new char[5];
		
		for (int i = 0; i < arData2.length; i++) {
			arData2[i] = (char)(i > 1 ? 66 + i : 65 + i);
		}
		
		for (int i = 0; i < arData2.length; i++) {
			System.out.println(arData2[i]);
		}
		
		
		
		
		
	}
}

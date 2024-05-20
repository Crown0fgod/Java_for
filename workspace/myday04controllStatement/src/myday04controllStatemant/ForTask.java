package myday04controllStatemant;

public class ForTask {
	public static void main(String[] args) {
//		실습
		
//		 1. 1 ~ 100까지 출력
//		 2. 100 ~ 1까지 출력
//		 3. 1 ~ 100까지 중 짝수만 출력
		
		
//		1 ~ 100까지 출력
//		for(int i = 0; i < 100; i = i + 1) {
//			System.out.println(i + 1);
//		}
//		
//		System.out.println("-----------------");
//		
//		100 ~ 1까지 출력
//		for(int i = 0; i < 100; i = i +1) {
//			System.out.println(100 - i);
//		}
//		
//		System.out.println("-----------------");
//		
//		1 ~ 100까지중 짝수만 출력
//		for(int i = 1; i < 50; i = i + 1) {
//			System.out.println(i*2);
//		}
		
//		강사님께서 적은 코드 
//		1 ~ 100까지 출력
//		for(int i = 0; i < 100; i++) {
//			System.out.println(i + 1);
//		}
//			
//		System.out.println("-----------------");	
//			
//		100 ~ 1까지 출력
//		for(int i = 0; i < 100; i++) {
//			System.out.println(100 - i);
//		}
//	
//		System.out.println("-----------------");
//		
//		1 ~ 100까지중 짝수만 출력
//		for(int i = 0; i < 50; i++) {
//			System.out.println((i + 1) * 2);
//		}
	
//		4. 1 ~ 10까지의 합 출력
//		5. A ~ F까지 출력
//		6. A ~ F까지 중 C를 제외하고 출력
	

//		4. 1 ~ 10까지의 합 출력
//		int num = 0;
//		for(int i = 0; i <= 10; i++) {
//			num +=1;
//			System.out.println(num + i);
//		}
		
//		System.out.println("-----------------");
//		
//		5. A ~ F까지 출력
//		for(int i = 0; i < 6; i++) {
//			System.out.println((char)+(i + 65));
//		}
//		
//		System.out.println("-----------------");
//		
//		6. A ~ F까지 중 C를 제외하고 출력
//		for(int i = 0; i < 5; i++) {
//			
//			System.out.println((char)(i > 1 ? i + 66 : i + 65));
//		}
		
//		강사님께서 적은 코드 
//		4. 1 ~ 10까지의 합 출력
		int result = 0;
	
		for(int i = 0; i < 10; i++) {
			result = result + i + 1;
			
			System.out.println(result);
		}
		System.out.println("결과 :" + result);
		
		System.out.println("-----------------");
		
//		5. A ~ F까지 출력	
		for(int i = 0; i < 6; i++) {
			System.out.println((char)(i+65));
		}
		
		System.out.println("-----------------");
		
//		6. A ~ F까지 중 C를 제외하고 출력
//		A  B  C  D  E  F
//		65 66 67 68 69 70
		for(int i = 0; i < 5; i++) {
			System.out.println((char)((i > 1 ? 66 : 65) + i));
		}
//		i가 1보다 크니 ? true면 66으로 false면 65로 
//		0 -> f ->65 로
//		1 -> f ->65 로 
//		2 -> t ->66 로
//		3 -> t ->66 로
//		4 -> t ->66 로 
//		모두 들어갔으면 1씩 증가하는 i를 더해
//		0 + 65 = 65
//		1 + 65 = 66
//		2 + 66 = 68 
//		3 + 66 = 69
//		4 + 66 = 70
//		모두 더했다면 아스키 코드로 변환하니 문자열 강제형변환 "char"를 적어
//		A B D E F 으로 출력됨.
		
		
		
		
		
		
	
	
		
	}
}

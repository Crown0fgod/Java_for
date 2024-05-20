package castingTest;

public class CastingTest1 {
	public static void main(String[] args) {
//		같은 자료형일 경우 콤마로 이어서 쓸 수 있다.
		double number1 = 8.43, number2 = 2.59;
		int result = 0;
//		초기값은 처음에 어떤 값을 넣을지 모를 때 넣는 것
//		정수 : 0
//		실수 : 0.0
//		문자 : ' '
//		문자열 : null, " "
				
//		자동 형변환
//		System.out.println(5 / 2); 		// 2라는 값이 나옴
//		System.out.println(5.0 / 2); 	// 2.5 라는 값이 나옴
		
//		강제 형변환
		System.out.println(5 / (double)2);
		System.out.println((int)8.43 + 2.59); 		// 10.59 출력
		System.out.println((int)(8.43 + 2.59)); 	// 11 출력
		
//		첫 실습
//		8.43 + 2.59 = 10 나오게 만들기
//		System.out.println((int)8.43 + (int)2.58);
//		
//		System.out.println("------------");
////		위에 선언한 변수 사용
//		
//		System.out.println((int)number1 + (int)number2);
//		
//		result = (int)number1 + (int)number2;
//		System.out.println(result);
		
		
		
		
		
	}
}

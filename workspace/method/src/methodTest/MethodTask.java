package methodTest;

public class MethodTask {
//	1. 1 ~ 10까지 println()으로 출력하는 메소드
//	void num() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println();
//		}
//	}
	
//	강사님께서 적은 소스
	void printFrom1To10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}// 선언
	}
//	2. "홍길동"을 n번 println()으로 출력하는 메소드
//	void name(String name, int end) {
//		for (int i = 0; i < end; i++) {
//			System.out.println(name);
//		}
//	}
//	강사님께서 적은 소스
	
//	void printHong(int count) {
//		for (int i = 0; i < count; i++) {
//			System.out.println("홍길동");
//		}
//	}
//	3. 이름의 n번 println()으로 출력하는 메소드
//	이름을 몇번 출력할지 모름.
	void printName(String name, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(name);
		}
	}
	
//	4. 세 정수를 뺄셈해주는 메소드
	int printmin(int number1, int number2, int number3) {
		System.out.println(number1 - number2 - number3);
		return number1 - number2 - number3;
	}
	
//	5. 1 ~ n까지의 합을 구해주는 메소드
	int printadd(int number1, int number2) {
		return number1 + number2 ;
	}
	
	public static void main(String[] args) {
		MethodTask methodTask = new MethodTask();
		
//		1번 사용
		methodTask.printFrom1To10(); // 사용
		
		System.out.println("------------");
//		2번 사용
//		methodTask.printHong(10);
		
		System.out.println("------------");
		
//		3번 사용
		methodTask.printName("김진수", 5);
		
		System.out.println("------------");
		 
//		4번 사용
		methodTask.printmin(10, 6, 7);
		
//		5번 사용
		MethodTask mt = new MethodTask();
		
		int result = mt.printadd(1, 20);
		System.out.println("결과 값 : " + result);
		
		
		
		
		
		
		
	}
}

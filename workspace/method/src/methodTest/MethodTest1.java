package methodTest;

public class MethodTest1 {
//	f	(x)	=	2x + 1
	
	int f(int x){
		return 2 * x + 1;
	}
	
//	두 정수에 덧셈 메소드 선언

	int add(int number1, int number2) {
		int result = number1 + number2;
		return result;
	}
	
	
//	이름 10번 출력
	
	void printName(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
		}
	}
	
//	이름 n번 출력
	
	void printNameNtime(String name, int end) {
		for (int i = 0; i < end; i++) {
			System.out.println(name);
		}
	}
	
//	1 ~ 10까지의 합
	
	int getTotal() {
		int total = 0;
		for (int i = 0; i < 10; i++) {
			total += i + 1;
		}
		return total;
	}
	
	
	
	
	
	
	
}

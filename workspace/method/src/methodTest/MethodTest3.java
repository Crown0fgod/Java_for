package methodTest;

public class MethodTest3 {
	
//	두 정수 덧셈 메소드
	int add(int number1, int number2) {
		return number1 + number2;
	}
	
	public static void main(String[] args) {
		MethodTest3 mt = new MethodTest3();
//		mt.add(10, 20);
		
		int result = mt.add(10, 20);
		System.out.println("결과값 : " + result);
	}
}

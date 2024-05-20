package operTset;

public class OperTest1 {
	public static void main(String[] args) {
		boolean isTrue = 10 != 11;
		
		
		System.out.println(10 == 11);
		System.out.println(10 != 11);
		System.out.println(isTrue);
		
//		AND - 두 조건식 모두 참이면 참
//		메모리확보 때문에 AND연산자에서 앞에가 false면 뒤에 값은 출력하지 않는다.
		System.out.println(isTrue && 10 == 10);
		System.out.println(isTrue && 10 != 10);
		
//		OR - 두 조건식중 하나라도 참이면 참
		System.out.println(isTrue || 10 != 10);
		
		int data = 0; 
		// 둘다 참이어야 출력하는데 뒤에 있는 값은 1 증가하는 값이기 때문에 true라 뒤에꺼는 출력하지 않는다.
//		System.out.println(10 == 20 && ++data == 0);
//		System.out.println(data);
		
		// 둘중 하나가 참이면 출력하기 때문에 앞에가 false라도 뒤에가 true이기 때문에 출력한다.
		System.out.println(10 == 20 || ++data == 0);
		System.out.println(data);

//		||(or) 쓰지 않고 true로 바꾸기
		
		System.out.println(isTrue && 10 != 10);
		
		System.out.println(isTrue && 10 == 10);
		
//		강사님께서 적은 코드
		
		System.out.println(isTrue && !(10 != 10));
		
		
		
		
		
	}
}

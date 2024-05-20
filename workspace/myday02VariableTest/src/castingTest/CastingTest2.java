package castingTest;

public class CastingTest2 {
	public static void main(String[] args) {
		char data = 'A';
		System.out.println(data + 1);
		
		System.out.println((char)data + 1); // 66 출력
		System.out.println((char)(data + 1)); // B 출력
		
//		최우선 연산자 	= ()
//		단항 연산자 	= 뒤에 항이 하나인 것
//		산술 연산자 	= +, -, *, /, ....
	}
}

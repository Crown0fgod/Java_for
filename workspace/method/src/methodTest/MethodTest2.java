package methodTest;

public class MethodTest2 {
//	주의사항
//	1. 메소드 선언은 무조건 메소드 밖에서
//	2. 사용은 무조건 메소드 안에서 작성
//	3. 
	
//	f	(x)	=	2x + 1
	
	int f(int x) {
		int result = 2 * x + 1;
		return result;
	} 
	
//	메소드 사용 방법
//	1. 메소드 선언 시 static을 붙여준다.
//	2. 사용하고자 하는 메소드의 소속을 알려준다.
	
	public static void main(String[] args) {
//		f(10);
		MethodTest2 mt = new MethodTest2();
		mt.f(10); // 내부적으로 실행은 되지만 출력은 안됨. (접근만 하는 소스)
		
		System.out.println(mt.f(5));
		
		
		
		
	
		
		
		
		
		
		
	}
}

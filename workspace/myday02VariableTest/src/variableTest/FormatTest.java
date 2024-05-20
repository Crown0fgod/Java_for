package variableTest;

public class FormatTest {
	public static void main(String[] args) {
		String name = "김진수";
		int age = 20;
		double height = 175.4;
		
//		System.out.println("이름 : 서식문자", name);
//		System.out.println("이름 : %s", name);
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d살\n", age);
//		System.out.printf("키 : %f\n", height);
		System.out.printf("키 : %.1fcm\n", height);
	
		
	}
}

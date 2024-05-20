package myday04controllStatemant;

public class WhileTest {
	public static void main(String[] args) {
		
//		for문과 while문 이름 10번 출력
		for(int i = 0; i < 10; i++) {  // for문은 몇번 출력할지 알때 사용하는게 좋다.
			System.out.println(i + 1 + ".김진수");
		}
		
		System.out.println("------------------");
		
		int count = 0;
		while(count != 10) {  // while문은 몇번 출력할지 모를때 사용하는게 좋다.
			count++;
			System.out.println(count + ".김진수");
		}
		
		
		
		
		
		
		
		
		
		
	}
}

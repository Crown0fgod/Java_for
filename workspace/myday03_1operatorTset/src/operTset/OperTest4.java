package operTset;

public class OperTest4 {
	public static void main(String[] args) {
		
//		1 ~ 10까지 중 3까지만 출력 break 사용
		for(int i = 0; i < 10; i ++) {
			System.out.println(i + 1);
			if(i == 2) {break;} // i가 2일때 +1이 되서 3이됨.;
		}
		
		System.out.println("----------------");
		
//		1 ~ 10까지 중 3만 제외하고 출력
		for(int i = 0; i < 10; i++) {
			if(i == 2) {continue;} // 반복을 10번 할껀데 i 가 2와 같다면 밑에있는 코드 실행하지마.
			System.out.println(i + 1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

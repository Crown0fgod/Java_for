package arrayTest;

public class ArTest {
	public static void main(String[] args) {
//		int[] arData = {1,3,4,6,8};
		
//		System.out.println(arData);  // 배열의 주소값이 출력
//		
//		System.out.println(arData.length);  // 배열의 길이 출력
		
		
//		System.out.println(arData[0]);
//		System.out.println(arData[1]);
//		System.out.println(arData[2]);
//		System.out.println(arData[3]);
//		System.out.println(arData[4]);
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println(arData[i]);
//		}
		
//	실습 : arData에 5,4,3,2,1을 순서대로 담은 후 출력	
		
		int[] arData = {5,4,3,2,1};
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
		System.out.println("------------");
		
		//강사님께서 적은 코드
		
		for (int i = 0; i < arData.length; i++) {
			arData[i] = 5 - i;
			System.out.println(arData[i]);
		}
		
		System.out.println("------------");
		
		//실무 코드
		
		for (int i = 0; i < arData.length; i++) {   // 저장공간으로 사용
			arData[i] = 5 - i;
		}
		
		for (int i = 0; i < arData.length; i++) {  //값을 출력하는거로 사용
			System.out.println(arData[i]);
		}
		
		
		
		
		
	}
}

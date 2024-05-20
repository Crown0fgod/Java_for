package arrayTest;

public class ArrDataTest {
	public static void main(String[] args) {
		int[][] arrData = { {3,4,5,6}, {8,9,1,4}, {1,9,6,7} }; // 3행 4열 
		
		System.out.println(arrData.length); // 행의 길이
		
		System.out.println(arrData[0].length); // 열의 길이
		
		int[][] arrData1 = { {3,4,5,6,5,}, {8,9,1,4}, {9,6,7} };
		int length = 0;
		
		for (int i = 0; i < arrData1.length; i++) {
			length += arrData[i].length;
		}
		
		System.out.println(length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
}

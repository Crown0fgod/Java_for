package myday04controllStatemant;

public class TrstPulMa {
	public static void main(String[] args) {
		int data = 0;
		int data1 = 0;
		
		System.out.println(data++); // 후위형 : 다음 라인부터 적용 
		System.out.println(data);
		
		System.out.println(++data1); // 전위형 : 해당 라인에서 바로 적용
		System.out.println(data1); 
	}
}

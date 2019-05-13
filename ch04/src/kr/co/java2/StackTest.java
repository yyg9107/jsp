package kr.co.java2;
//2019.05.03
//윤영근
//Stack 메모리 실습
public class StackTest {
	public static void main(String[] args) {
		
		int result = 0;
		int begin = 1;
		int end = 10;
		
		//static 메소드에서 nonstatic 메소드를 호출하지 못한다.
		result = sum(begin,end);
		System.out.print("result : "+result);
		
		//StackTest st = new StackTest();
		//st.sum(begin, end);
		//이 방법을 더 많이 쓴다
	}
	
	public static int sum(int start, int end) {
		int sum = 0;
		for(int i = start ; i <= end ; i++) {
			sum += i;
		}
		return sum;
	}
}

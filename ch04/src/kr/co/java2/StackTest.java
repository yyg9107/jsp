package kr.co.java2;
//2019.05.03
//������
//Stack �޸� �ǽ�
public class StackTest {
	public static void main(String[] args) {
		
		int result = 0;
		int begin = 1;
		int end = 10;
		
		//static �޼ҵ忡�� nonstatic �޼ҵ带 ȣ������ ���Ѵ�.
		result = sum(begin,end);
		System.out.print("result : "+result);
		
		//StackTest st = new StackTest();
		//st.sum(begin, end);
		//�� ����� �� ���� ����
	}
	
	public static int sum(int start, int end) {
		int sum = 0;
		for(int i = start ; i <= end ; i++) {
			sum += i;
		}
		return sum;
	}
}

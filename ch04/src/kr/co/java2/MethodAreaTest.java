package kr.co.java2;
//2019.05.03
//윤영근
//메소드 영역  실습
public class MethodAreaTest {

	public static void main(String[] args) {
		
		Increase ic1 = new Increase();
		Increase ic2 = new Increase();
		Increase ic3 = new Increase();
		
		//클래스 변수
		Increase.num2 = 2;
		
		
		//클래스 메서드
		Increase.add();
	}

}

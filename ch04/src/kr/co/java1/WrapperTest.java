package kr.co.java1;

import javafx.application.Application;
//2019/05/02
//윤영근
//wrapper 클래스 실습하기

public class WrapperTest {
	public static void main(String[] args) {
		
		
		//기본타입
		boolean var1 = true;
		int var2 = 10;
		long var3 = 1000L;
		char var4 = 'A';
		double var5 = 1.2345;
		
		//기본타입 -> String
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = String.valueOf(var3);
		String s4 = ""+var4;
		String s5 = ""+var5;
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		System.out.println("s4 : "+s4);
		System.out.println("s5 : "+s5);
		
		
		// wrapper class
		
		Boolean wp1 = new Boolean(true);
		Integer wp2 = new Integer(10);
		Long wp3 = new Long(1000);
		Double wp4 = new Double(1.2345);
		
		
		//wrapper -> string
		String st1 = wp1.toString();
		String st2 = wp2.toString();
		String st3 = wp3.toString();
		String st4 = wp4.toString();
		
		System.out.println("str1 : "+st1);
		System.out.println("str2 : "+st2);
		System.out.println("str3 : "+st3);
		System.out.println("str4 : "+st4);
		
		
		//wrapper의 활용 1(String -> 기본타입)
		
		String str1 = "false";
		String str2 = "100";
		String str3 = "1.234567";
		String str4 = new String("hello");
		
		boolean r1 = Boolean.parseBoolean(str1);
		int r2 = Integer.parseInt(str2);
		double r3 = Double.parseDouble(str3);
		
		System.out.println("r1 : "+r1);
		System.out.println("r1 : "+r2);
		System.out.println("r3 : "+r3);
		
		
		//wrapper 활용 2(String -> Wrapper)
		//value of 를 통해서 객체형으로 만들 수 있다.
		
		Boolean w1 = Boolean.valueOf(str1);
		Integer w2 = Integer.valueOf(str2);
		Double w3 = Double.valueOf(str3);
		
		System.out.println("w1 : "+w1);
		System.out.println("w2 : "+w2);
		System.out.println("w3 : "+w3);
		
		// auto-boxing
		
		Boolean box1 = true;
		// Boolean box1 = new Boolean(true); 과 다를게 없다.
		
		Integer box2 = 100;
		Double box3 = 1.123;
		
		// auto-unboxing
		
		boolean ubox1 = box1;
		int ubox2 = box2;
		double ubox3 = box3;
		
		System.out.println("ubx1 : "+ubox1);
		System.out.println("ubx2 : "+ubox2);
		System.out.println("ubx3 : "+ubox3);
		
		
		
	}
}

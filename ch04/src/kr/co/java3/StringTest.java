package kr.co.java3;
//2019.05.03
//윤영근
//String 실습하기
public class StringTest {
	public static void main(String[] args) {
		
		char c = 'H';
		char[] cArr = {'H','e','l','l','o'};
		
		// 문자열(문자 + 배열) 배열의 특징인 객체이다
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = new String("hello");
		String str4 = "Hello";
		
		
		//문자열 비교
		if(str1 == str2) {
			System.out.println("str1과  str2의 주소값(참조값)이 같다");
		}else {
			System.out.println("str1과  str2의 주소값(참조값)이 다르다");
		}
		if(str1 == str4) {
			System.out.println("str1과  str4의 주소값(참조값)이 같다");
		}else {
			System.out.println("str1과  str4의 주소값(참조값)이 다르다");
		}
		if(str1.equals(str2)) {
			System.out.println("str1과  str2의 문자열이 같다");
		}else {
			System.out.println("str1과  str2의 문자열이 다르다");
		}
		
		
		
		// 문자열 멤버
		System.out.println("str 문자열 길이 : "+str1.length());
		
		char c1 = str1.charAt(0);
		char c2 = str1.charAt(1);
		char c3 = str1.charAt(2);
		
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
		System.out.println("c3 : "+c3);
		
		String v1 = "Hello Korea";
		String v2 = v1.substring(6);
		String v3 = v1.substring(6,9);
		
		
		System.out.println("v2 : "+v2);
		System.out.println("v3 : "+v3);
		
		
		int v4 = v1.indexOf("e");
		int v5 = v1.lastIndexOf("e");
		System.out.println("v4 : "+v4);
		System.out.println("v5 : "+v5);
		
		
		String v6 = v1.replace("Korea", "Busan");
		System.out.println("v6 : "+v6);
		
		
		
	}
}

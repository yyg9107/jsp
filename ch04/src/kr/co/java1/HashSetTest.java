package kr.co.java1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//2019.5.2
//윤영근
//Collection HashSet 실습하기

public class HashSetTest {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(3);
		
		System.out.println("집합 원소 갯수 : "+set.size()); // 집합은 중복을 허용하지 않는다.
		Iterator<Integer> it = set.iterator(); // 집합의 반복자를 구한다.
		
		while(it.hasNext()) {
			System.out.println("set 원소 : "+it.next());
		}
	}
}

package kr.co.java1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//2019.5.2
//������
//Collection HashSet �ǽ��ϱ�

public class HashSetTest {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(3);
		
		System.out.println("���� ���� ���� : "+set.size()); // ������ �ߺ��� ������� �ʴ´�.
		Iterator<Integer> it = set.iterator(); // ������ �ݺ��ڸ� ���Ѵ�.
		
		while(it.hasNext()) {
			System.out.println("set ���� : "+it.next());
		}
	}
}

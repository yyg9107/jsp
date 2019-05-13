package kr.co.java2;

public class HeapTest {

	public static void main(String[] args) {
		
		Args arg = new Args();
		arg.x = 100;
		
		int [] arr = {1,2,3};
		
		arg.add(arg.x);
		System.out.println("arg.x = "+arg.x);
		
		arg.add(arg);
		System.out.println("arg.x = "+arg.x);
		
		arg = arg.addNew(arg);
		System.out.println("arg.x = "+arg.x);
		
		arg.add(arr);
		System.out.println("arr[0] = "+arr[0]);
	}

}

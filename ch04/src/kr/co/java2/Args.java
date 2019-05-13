package kr.co.java2;

public class Args {
	
	int x;
	
	public void add(int x) {
		this.x = x + 50;
	}
	public void add(int[] arr) {
		arr[0]++;
	}
	public void add(Args arg) {
		arg.x += 40;
	}
	public Args addNew(Args arg) {
		arg = new Args(); 
		return arg;
	}
}

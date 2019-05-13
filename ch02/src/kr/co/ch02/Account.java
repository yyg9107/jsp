package kr.co.ch02;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;

public class Account {
	private String bank;
	private String uid;
	private String name;
	private int money;
	
	public Account(String bank,String uid, String name, int money) {
		this.bank = bank;
		this.uid = uid;
		this.name = name;
		this.money = money;
	}
	
	public void deposit(int money) {
		this.money += money; 
	}
	public void withdraw(int money) {
		this.money -= money;
	}
	public void info(JspWriter out) throws IOException{
		out.println("<p>");
		out.println("은행명: "+bank+"<br/>");
		out.println("계좌번호: "+uid+"<br/>");
		out.println("입금주: "+name+"<br/>");
		out.println("현재잔액: "+money+"<br/>");
		out.println("</p>");
	}

}

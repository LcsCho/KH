package oop.modifier2;

import java.util.Scanner;

public class Bankbook {
	private String name;
	private int period, count, pay, balance;
	
	public Bankbook(String name, int period, int count, int pay, int balance) {
		this.setName(name);
		this.setPeriod(period);
		this.setCount(count);
		this.setPay(pay);
		this.setBalance(balance);
	}
	public Bankbook(String name, int period, int pay) { this(name, period, 1, pay, 0); }
	
	public void setName(String name) { this.name = name; }
	public void setPeriod(int period) {
		switch(period) {
		case 1, 2, 3, 5, 10:
			this.period = period;
		}
	}
	public void setCount(int count) { this.count = count; }
	public int getCount() { return period * 12 + 1; }
	public void setPay(int pay) { if (pay % 10000 == 0) this.pay = pay; }
	public void setBalance(int balance) {
		if (balance < 0) return;
		this.balance = balance;
	}
	public String getFull() {
		if (count == getCount()) return "현재상태: 만기\n";
		else return "";
	}
	
	public void show() {
		while (true) {
			System.out.println("이름: " + name);
			System.out.println("기간: " + period);
			System.out.println("납입회차: " + count);
			System.out.println("납입금액: " + pay);
			System.out.println("잔액: " + balance);
			System.out.print(getFull());
			System.out.println("만기 예상 금액: " + getFullBalance() + "\n");
			Scanner sc = new Scanner(System.in);
			System.out.print("next를 호출하고 싶으면 1을, 종료하고 싶으면 아무키 입력");
			int num = sc.nextInt();
			if (num == 1) {
				setNext();
				System.out.println("<next 진행 후 출력>");
			}
			else break;
		}
	}
	public int getFullBalance() { return (getCount() - count) * pay + balance; }
	public void setNext() {
		if (count != getCount()) {
			count++;
			balance += pay;
		}
	}
}

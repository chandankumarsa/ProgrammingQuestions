package com.chandan.ArrayList;

public class UserProg {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.addpos(25, 2);
		a.remove(4);
		System.out.println(a.size());
		System.out.println(" =========================== ");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
}

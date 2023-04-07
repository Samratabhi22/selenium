package com.example.demo.com.example.demo;

public class U {
	  static int  a;
	
	public   void test() {
		int a=8;
		System.out.println(a);
		System.out.println(this.a);
	}
	public   void test2() {
		int a=8;
		System.out.println(a);
		this.test();
	}
	
public static void main(String [] args) {
	U obj=new U();
	//obj.test();
	obj.test2();
	
}
}

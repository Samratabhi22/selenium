package com.example.demo.com.example.demo;

public class V {
int i;
public  void test() {
	int i=10;
	System.out.println(i);
	System.out.println(this.i);
}
	public static void main(String [] args) {
		V obj1=new V();
		V obj2=new V();
		obj1.i=5;
		obj1.test();
		obj2.test();
	}
}

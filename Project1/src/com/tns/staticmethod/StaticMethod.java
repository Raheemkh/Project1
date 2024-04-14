package com.tns.staticmethod;

public class StaticMethod {
	private  static int section;

	private  static int srNo;
	static {
	System.out.println("Static block");	
		srNo=100;
		
	}
	//static constuctor is called as soon
StaticMethod(){
System.out.println("constuctor");
srNo++;//non static methos can access static
section++;
}
//static method
static void display() {
System.out.println("Static method");
System.out.println("serialno" +srNo);
System.out.println("section" + section);
}
}

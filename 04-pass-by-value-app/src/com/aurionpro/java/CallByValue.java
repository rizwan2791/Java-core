package com.aurionpro.java;

public class CallByValue {
 public static void main(String args[]) {
	 int num=10;
	 System.out.println(num);
	 increamentNumberByOne(num);
	 System.out.println(num);
	 
 }
 static void increamentNumberByOne(int num) {
	 num=num+1;
 }
}

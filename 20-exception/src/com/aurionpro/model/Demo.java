package com.aurionpro.model;

public class Demo {
	public static void main(String[] args) {
		int c=0;
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			 c =a/b;
			 System.out.println("Printing after Expception ,Inside try");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(RuntimeException e) {
			System.out.println("RuntimeException");
		}catch(Exception e)	{
			System.out.println("RuntimeException");
		}finally {
			System.out.println("Hello you are in finally");
		}
		System.out.println("Division "+c);
	}

}

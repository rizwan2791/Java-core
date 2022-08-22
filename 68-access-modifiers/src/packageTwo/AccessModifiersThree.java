package packageTwo;

import packageOne.*;

public class AccessModifiersThree extends AcessModifiersOne{
	public static void main(String[] args) {
//		AcessModifiersOne a=new AcessModifiersOne(); cannot access default access modifier in another package
		System.out.println("------Public  Access Modifiers----access to same and different packages /can be accesed by inheritance too");
		AcessModifiersOne a=new AcessModifiersOne();
		System.out.println(a.sum);
		System.out.println(a.returnSum());
		System.out.println("------Protacted  Access Modifiers----Can be accesssed to  other package by inheritance");
		AccessModifiersThree three=new AccessModifiersThree();
		System.out.println(three.z);
		System.out.println(three.returnZ());
	}
}

package com.aurionpro.test;

import com.aurionpro.model.Man;
import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;

public class ManBoyTest {

	public static void main(String[] args) {
//		case1();
//		case2();
//		case3();
		case4();
		case5();
		case6();
	}

	private static void case6() {
		Object obj;
		obj=10;
		System.out.println(obj.getClass());
		obj="Rizwan";
		System.out.println(obj.getClass());
		obj=10<9;
		System.out.println(obj.getClass());
	}

	private static void case5() {
		atThePark(new Man());
		atThePark(new Kid());
		atThePark(new Boy());
		atThePark(new Infant());

	}

	private static void atThePark(Man man) {
		man.play();
	}
//
//	private static void case1() {
//		Man man = new Man();
//		man.read();
//		man.play();
//
//	}
//
//	private static void case2() {
//		Boy boy = new Boy();
//		boy.read();
//		boy.play();
//
//	}
//
//	private static void case3() {
//		Man man = new Kid();
//		man.read();
//		man.play();
//
//	}

	private static void case4() {
//		Infant infant =(Infant) new Man(); cannot be done
//		infant.read();
//		infant.play();
	}

}

package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotional;
import com.aurionpro.model.IMannerable;
import com.aurionpro.model.Man;

public class InterfaceTest {

	public static void main(String[] args) {
		Man man=new Man();
		Boy boy=new Boy();
		atTheParty(man);
		atTheMovies(boy);
		atHome(man);
	}

	private static void atHome(IEmotional person) {
		person.cry();
		person.laugh();
		
	}

	private static void atTheMovies(IMannerable person) {
		person.greet();
		person.depart();
		
	}

	private static void atTheParty(IMannerable person) {
		person.greet();
		person.depart();
		
	}
	
	

}

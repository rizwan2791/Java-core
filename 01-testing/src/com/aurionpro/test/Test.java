package com.aurionpro.test;
import com.aurionpro.model.*;
import java.util.Scanner;

import com.aurionpro.model.*;

public class Test {
	public static void main(String[] args) {
		Player  obj=new Player("Rizwan", 21);
		Player  obj1=new Player("dhoni",23);
		Player elder=obj.AgeGreater(obj1);
		printPlayerDetails(elder);
		
	}

	private static void printPlayerDetails(Player elder) {
		System.out.println("Name"+elder.getName());
		System.out.println("Age"+elder.getAge());
		System.out.println("ID"+elder.getId());
		
		
	}
	
}

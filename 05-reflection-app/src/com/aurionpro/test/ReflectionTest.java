package com.aurionpro.test;
import com.aurionpro.model.*;
import java.lang.reflect.Modifier;
public class ReflectionTest {
	public static void main(String[] args) {
		String name;
		name = args[0];
		try {
			Class cl = Class.forName(name);
			String modifiers = Modifier.toString(cl.getModifiers());
			if (modifiers.length() > 0)
				System.out.print(modifiers + " ");
			System.out.print("class " + name);
			System.out.print("\n{\n");
			Reflection obj = new Reflection();
			System.out.println("Fields");
			obj.printFields(cl);
			System.out.println("Methods");
			obj.printMethods(cl);
			System.out.println("Constructor");
			obj.printConstructors(cl);
			System.out.println();
			System.out.println("}");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}

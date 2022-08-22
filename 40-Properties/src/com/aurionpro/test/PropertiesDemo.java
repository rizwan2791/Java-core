package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		try {
			Properties p = new Properties();
			FileInputStream news = new FileInputStream("./lib/Tester.properties");
			p.load(news);
			System.out.println(p);
			System.out.println("------------------------");
			System.out.println(p.getProperty("Username"));
			System.out.println(p.getProperty("passward"));
			System.out.println("-----------------------");
			Enumeration e=p.propertyNames();
			while(e.hasMoreElements()) {
				System.out.println(e.nextElement());
			}
			p.setProperty("Username", "Sarah");
			System.out.println(p);
			System.out.println("-----------------------");
			FileOutputStream out = new FileOutputStream("./lib/Tester.properties");
			p.store(out, "Rizwan TO Sarah");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

package com.aurionpro.test;
import com.aurionpro.model.endoffile;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.aurionpro.model.Employee;
import com.aurionpro.model.endoffile;
import com.aurionpro.model.endoffile;
public class DeserializationTest {

	public static void main(String[] args) throws ClassNotFoundException {
//		Object emp = null;
		Employee[] emp=null;
		try {
			FileInputStream file = new FileInputStream("./lib/test.bin");
			ObjectInputStream in = new ObjectInputStream(file);
			
//			while((emp = in.readObject()) instanceof endoffile == false )	{
//				System.out.println(emp.toString());
//			}
			emp= (Employee[]) in.readObject();

			System.out.println();
			in.close();
			file.close();
			for(Employee e:emp) {
				System.out.println(e.toString());

			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

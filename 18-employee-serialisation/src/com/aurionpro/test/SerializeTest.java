package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.aurionpro.model.Employee;
import com.aurionpro.model.endoffile;


public class SerializeTest {

	public static void main(String[] args) {
		try {
			FileOutputStream file = new FileOutputStream("./lib/test.bin");
			ObjectOutputStream out = new ObjectOutputStream(file);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of Employees : ");
			int n = sc.nextInt();
			Employee[] emp = new Employee[n];
			for (int i = 0; i < n; i++) {
				System.out.print("Enter Id :");
				int id = sc.nextInt();
				System.out.print("Name : ");
				String name = sc.next();
				System.out.println("Enter Salary : ");
				int sal=sc.nextInt();
				emp[i] = new Employee(id, name, sal);
				out.writeObject(emp[i]);
			}
//			out.writeObject(new endoffile());
			out.close();
			file.close();
			System.out.println("Employee Obj Serialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}

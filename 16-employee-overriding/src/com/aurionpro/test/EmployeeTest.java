package com.aurionpro.test;
import com.aurionpro.model.*;
public class EmployeeTest {

	public static void main(String[] args) {

		Manager manager = new Manager(101, "Rizwan", 26000);
		salarySlip(manager);
		Developer developer = new Developer(102, "Kaif",19500 );
		salarySlip(developer);
		Accountant accountant = new Accountant(103, "Sarah",500000);
		salarySlip(accountant);

	}

	private static void salarySlip(Employee emp) {
		System.out.println("Salary Slip \n");
		System.out.println("Employee Number : " + emp.getEmployeeNumber());
		System.out.println("Employee Name : " + emp.getEmpName());
		System.out.println("Employee Basic Salary : " + emp.getBasicSalary());
		if (emp.getHra() > 0)
			System.out.println("HRA : " + emp.getHra());
		if (emp.getDa() > 0)
			System.out.println("DA : " + emp.getDa());

		if (emp.getTa() > 0)
			System.out.println("TA : " + emp.getTa());

		if (emp.getPa() > 0)
			System.out.println("PA : " + emp.getPa());

		if (emp.getOt() > 0)
			System.out.println("OT : " + emp.getOt());

		if (emp.getPerks() > 0)
			System.out.println("Perks :" + emp.getPerks());
		System.out.println("Annual CTC : " + emp.calculateAnnualCTC());
		System.out.println("----------------------------\n\n");

	}

}
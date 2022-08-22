package com.aurionpro.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegionCountryTest {
	public static ArrayList<Countries> europe = new ArrayList<>();
	public static ArrayList<Countries> americas = new ArrayList<>();
	public static ArrayList<Countries> asia = new ArrayList<>();
	public static ArrayList<Countries> MiddleEast = new ArrayList<>();

	public static void main(String[] args) {
		ArrayList<Region> region = new ArrayList<Region>();
		ArrayList<Countries> countries = new ArrayList<Countries>();
		region.add(new Region(1, "Europe"));
		region.add(new Region(2, "Americas"));
		region.add(new Region(3, "Asia"));
		region.add(new Region(4, "Middle East and Africa"));
		countries.add(new Countries("IT", "Italy", 1));
		countries.add(new Countries("JP", "Japan", 3));
		countries.add(new Countries("US", "United States of America", 2));
		countries.add(new Countries("CA", "Canada", 2));
		countries.add(new Countries("CN", "China", 3));
		countries.add(new Countries("IN", "India", 3));
		countries.add(new Countries("AU", "Australia", 3));
		countries.add(new Countries("ZW", "Zimbabwe", 4));
		countries.add(new Countries("SG", "Singapore", 3));
		countries.add(new Countries("UK", "United Kingdom", 1));
		countries.add(new Countries("FR", "France", 1));
		countries.add(new Countries("DE", "Germany", 1));
		countries.add(new Countries("ZM", "Zambia", 4));
		countries.add(new Countries("EG", "Egypt", 4));
		countries.add(new Countries("BR", "Brazil", 2));
		countries.add(new Countries("CH", "Switzerland", 1));
		countries.add(new Countries("NL", "Netherlands", 1));
		countries.add(new Countries("MX", "Mexico", 2));
		countries.add(new Countries("KW", "Kuwait", 4));
		countries.add(new Countries("IL", "Israel", 4));
		countries.add(new Countries("DK", "Denmark", 1));
		countries.add(new Countries("HK", "HongKong", 3));
		countries.add(new Countries("NG", "Nigeria", 4));
		countries.add(new Countries("AR", "Argentina", 2));
		countries.add(new Countries("BE", "Belgium", 1));
		groupby(countries);
		System.out.println("----Countires Grouped by Region---------");
		System.out.println("Europe Region Countries "+europe);
		System.out.println("Americas Region Countries "+americas);
		System.out.println("Asia Region Countries "+asia);
		System.out.println("Middle east Region Countries "+MiddleEast);
		System.out.println(("--Number of Counties in each Region----"));
		System.out.println("Europe :"+europe.size());
		System.out.println("Americas : "+americas.size());
		System.out.println("Asia : "+asia.size());
		System.out.println("Middle East and Africa  :"+MiddleEast.size());
		System.out.print("Enter Country Code : ");
		Scanner sc =new Scanner(System.in);
		String countryCheck=sc.next();
		for(Countries c:countries) {
			if(countryCheck.equalsIgnoreCase(c.getCountryCode())) {
				System.out.println("Country Name : "+c.getCountryName());
				int check=c.getCountryRegion();
				for(Region r:region) {
					if(check == r.getRegionId())
						System.out.println("Region Name  : "+r.getRegionName());
				}
			}
		}

	}

	private static void groupby(ArrayList<Countries> countries) {
		for (Countries c : countries) {
			if (c.getCountryRegion() == 1)
				europe.add(c);
			else if (c.getCountryRegion() == 2)
				americas.add(c);
			else if (c.getCountryRegion() == 3)
				asia.add(c);
			else if (c.getCountryRegion() == 4)
				MiddleEast.add(c);
		}

	}

}

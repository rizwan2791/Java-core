package com.aurionpro.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegionCountryTest {
	static ArrayList<Countries> europeCountries = new ArrayList<>();
	static ArrayList<Countries> americaCountries = new ArrayList<>();
	static ArrayList<Countries> asiaCountries = new ArrayList<>();
	static ArrayList<Countries> meaCountries = new ArrayList<>();

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
		groupingCountries(countries);
		System.out.println("[1-(Europe)]  : " + europeCountries);
		System.out.println("[2-(Americas)]  : " + americaCountries);
		System.out.println("[3-(Asia) ] : " + asiaCountries);
		System.out.println("[4(Middle East and Africa)] : " + meaCountries);
		System.out.println("---------------------------------------");
		System.out.println("Countries in [1-(Europe)] :" + europeCountries.size());
		System.out.println("Countries in [2-(Americas) :" + americaCountries.size());
		System.out.println("Countries in [3-(Asia) ] :" + asiaCountries.size());
		System.out.println("Countries in [4(Middle East and Africa)]  :" + meaCountries.size());
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------------------");
		System.out.print("Enter country code: ");
		String code = sc.next();
		for (Countries s : countries) {
			if (code.equalsIgnoreCase(s.getCountryCode())) {
				System.out.println("Country Name : "+s.getCountryName());
				int countryCode = s.getCountryRegion();
				switch (countryCode) {
				case 1:
					System.out.println("Region : Europe");
					break;
				case 2:
					System.out.println("Region : America ");
					break;
				case 3:
					System.out.println("Region : Asia ");
					break;
				case 4:
					System.out.println("Region : Middle East and Africa");
					break;
				default:
					break;
				}

			}

		}

	}

	private static void groupingCountries(ArrayList<Countries> countries) {
		for (Countries i : countries) {
			if (i.getCountryRegion() == 1) {
				europeCountries.add(i);
			}
			if (i.getCountryRegion() == 2) {
				americaCountries.add(i);
			}
			if (i.getCountryRegion() == 3) {
				asiaCountries.add(i);
			}
			if (i.getCountryRegion() == 4) {
				meaCountries.add(i);
			}
		}
	}

}
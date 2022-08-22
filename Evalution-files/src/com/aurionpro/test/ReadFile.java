package com.aurionpro.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReadFile {
	public static void main(String args[]) throws Exception {
		Scanner sc;
		try {
			sc = new Scanner(new File("./lib/test.txt"));
			sc.useDelimiter(",");
			ArrayList<Countries> c = new ArrayList<Countries>();
			while (sc.hasNext()) {
				String countryCode = sc.next();
				String countryName = sc.next();
				String countryRegion = sc.next();
				c.add(new Countries(countryCode, countryName, countryRegion));
			}

			for (Countries s : c) {
				System.out.println(s.toString());
			}

		} catch (FileNotFoundException e) {

		}

	}

}
package com.aurionpro.model;

import java.util.StringTokenizer;

public class StringTokenize {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hi how are you");
		System.out.println("Number of Tokens : " + st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("------------------------------");
		StringTokenizer st1 = new StringTokenizer("Whats going ,on boys", ",");// enumerations
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		System.out.println("------------------------------");
		StringTokenizer st2 = new StringTokenizer("hello whats,up ");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken(","));// enumerations
		}
		System.out.println("-------------------------------");
		StringTokenizer st3 = new StringTokenizer("Hello:my name is:Rizwan", ":", false);// if false delimiter is not
		// cosidered as token
		System.out.println("Number of Tokens : " + st3.countTokens());
		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		System.out.println("-------------------------------");
		StringTokenizer st4 = new StringTokenizer("Hello:my name is:Rizwan", ":", true);// if true delimiter is
		// cosidered as token
		System.out.println("Number of Tokens : " + st4.countTokens());
		while (st4.hasMoreTokens()) {
			System.out.println(st4.nextToken());
		}
	}
}
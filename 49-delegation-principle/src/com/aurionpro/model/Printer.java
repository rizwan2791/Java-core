package com.aurionpro.model;

public class Printer {
	DelegatePrinter dprinter = new DelegatePrinter();
	public void print() {
		dprinter.print();
	}

}

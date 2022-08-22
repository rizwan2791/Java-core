package com.aurionpro.model;

public class Advertisement {
		IDisplayable disp;
		public void setDisplayModule(IDisplayable obj) {
			disp=obj;
		
	}
	public void showAdvertisement() {
		disp.display();
	}

}

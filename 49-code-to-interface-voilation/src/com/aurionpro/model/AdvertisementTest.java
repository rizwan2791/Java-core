package com.aurionpro.model;

public class AdvertisementTest {

	public static void main(String[] args) {
		Advertisement obj=new Advertisement();
		IDisplayable monitor=new Monitor();
		obj.setDisplayModule(monitor);
		obj.showAdvertisement();
		IDisplayable tv=new Television();
		obj.setDisplayModule(tv);
		obj.showAdvertisement();
	}

}

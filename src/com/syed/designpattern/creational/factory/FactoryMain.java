package com.syed.designpattern.creational.factory;
//Factory pattern is used when we have a Super class with multiple 
//sub classes and based on input we have to return one of the sub classes;
public class FactoryMain {
	public static void main(String[] args) {
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj= osf.getInstance("Open");
		obj.specification();
	}

}

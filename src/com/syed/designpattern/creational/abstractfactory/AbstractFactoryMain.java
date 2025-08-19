package com.syed.designpattern.creational.abstractfactory;
// Factory Pattern is a factory of factory

//Replace your old OperatingSystemFactory with FactoryProducer 
//+ OSFactory and its concrete implementations.
public class AbstractFactoryMain {
	public static void main(String[] args) {
		OSFactory factory = FactoryProducer.getFactory("Open");
		OS os = factory.createOS();
		os.specification();
	}
}
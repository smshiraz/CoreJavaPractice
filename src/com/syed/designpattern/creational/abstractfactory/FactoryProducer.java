package com.syed.designpattern.creational.abstractfactory;

//Factory Producer (Factory of Factories)
public class FactoryProducer {
	public static OSFactory getFactory(String type) {
		if (type == null)
			return new LegacyOSFactory();
		if ("Open".equalsIgnoreCase(type))
			return new OpenSourceOSFactory();
		if ("Closed".equalsIgnoreCase(type))
			return new ClosedSourceOSFactory();
		return new LegacyOSFactory();
	}
}
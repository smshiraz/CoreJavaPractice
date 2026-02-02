
//This programs displays Method Hiding.
package com.syed.corejava;

class DemoBase {

	public void nonStaticMethod() {
		System.out.println("Base non-static method");
	}

	public static void staticMethod() {
		System.out.println("Base static method");
	}
}

public class DemoChild extends DemoBase {

	@Override
	public void nonStaticMethod() {
		System.out.println("Child non-static method");
	}

	public static void staticMethod() {
		System.out.println("Child static method");
	}

	public static void main(String[] args) {

		// For non static method
        System.out.println("------- For NON STATIC method----------");  
		DemoBase demoBase = new DemoBase();
		System.out.println("DemoBase demoBase = new DemoBase();");
		demoBase.nonStaticMethod();

		DemoChild demoChild = new DemoChild();
		System.out.println("DemoChild demoChild = new DemoChild();");
		demoChild.nonStaticMethod();
		
		DemoBase demoBaseChild = new DemoChild();
		System.out.println("DemoBase demoBaseChild = new DemoChild();");
		demoBaseChild.nonStaticMethod();
		
		System.out.println();		
		System.out.println("------- For STATIC method----------"); 
		System.out.println();
		
		DemoBase demoBaseStatic = new DemoBase();
		System.out.println("DemoBase demoBaseStatic = new DemoBase();");
		demoBaseStatic.staticMethod();

		DemoChild demoChildStatic = new DemoChild();
		System.out.println("DemoChild demoChildStatic = new DemoChild();");
		demoChildStatic.staticMethod();
		
		DemoBase demoBaseChildStatic = new DemoChild();
		System.out.println("DemoBase demoBaseChildStatic = new DemoChild();");
		demoBaseChildStatic.staticMethod();

	}
}

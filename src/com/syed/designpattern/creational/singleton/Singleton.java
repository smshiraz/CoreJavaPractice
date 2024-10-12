package com.syed.designpattern.creational.singleton;

//double checked locking pattern, where only critical section of code is locked. 
//Programmer call it double checked locking because there are two checks for _instance == null,
//one without locking and other with locking (inside synchronized) block. Here is how double checked 
//locking looks like in Java :

public class Singleton {
	private static Singleton _instance;
	
	private Singleton()//to defeat instantiation
	{
		
	}
	
	public static Singleton getInstanceDC() {
        if (_instance == null) {                // Single Checked
            synchronized (Singleton.class) {
                if (_instance == null) {        // Double checked
                    _instance = new Singleton();
                }
            }
        }
        return _instance;
}

}

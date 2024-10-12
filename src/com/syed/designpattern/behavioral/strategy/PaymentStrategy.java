package com.syed.designpattern.behavioral.strategy;
//Strategy design pattern is one of the behavioral design pattern. 
//Strategy pattern is used when we have multiple algorithm for a specific task and client decides 
//the actual implementation to be used at runtime.
public interface PaymentStrategy {

	public void pay(int amount);
}
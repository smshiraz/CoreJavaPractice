package com.syed.designpattern.creational.abstractfactory;

//Concrete Factory 3 (default/legacy)
public class LegacyOSFactory implements OSFactory {
 @Override
 public OS createOS() {
     return new Windows();
 }
}
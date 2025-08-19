package com.syed.designpattern.creational.abstractfactory;

//Concrete Factory 2
public class ClosedSourceOSFactory implements OSFactory {
 @Override
 public OS createOS() {
     return new IOS();
 }
}
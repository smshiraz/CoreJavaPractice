package com.syed.designpattern.creational.abstractfactory;

//Concrete Factory 1
public class OpenSourceOSFactory implements OSFactory {
 @Override
 public OS createOS() {
     return new Android();
 }
}
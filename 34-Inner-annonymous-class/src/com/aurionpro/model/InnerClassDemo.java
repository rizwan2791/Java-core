package com.aurionpro.model;

public class InnerClassDemo {
 public static void main(String[] args) {
  OuterClass out=new OuterClass(1,"Rizwan");
  out.printOuterClass(); 
  System.out.println("----------------");
  OuterClass.Inner inner=out.new Inner(1, 500);
  inner.printInnerClass();
 }
 
 

}
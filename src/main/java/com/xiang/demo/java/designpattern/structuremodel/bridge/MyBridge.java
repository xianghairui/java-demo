package com.xiang.demo.java.designpattern.structuremodel.bridge;

public class MyBridge extends Bridge {
	
	public void method() {
		getSource().method();
	}
	
}

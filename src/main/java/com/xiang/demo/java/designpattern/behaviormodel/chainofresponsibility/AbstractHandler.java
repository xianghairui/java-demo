package com.xiang.demo.java.designpattern.behaviormodel.chainofresponsibility;

public abstract class AbstractHandler {
	
	private Handler handler;
	
	public Handler getHandler() {
		return handler;
	}
	
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
}

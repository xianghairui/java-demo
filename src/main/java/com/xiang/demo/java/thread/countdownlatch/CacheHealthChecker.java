package com.xiang.demo.java.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CacheHealthChecker extends BaseHealthChecker {

	public CacheHealthChecker(CountDownLatch latch) {
		super("Cache Service", latch);
	}

	@Override
	public void verifyService() {
		System.out.println("Checking " + this.getServiceName());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		System.out.println(this.getServiceName() + "is up");
	}

	
	
}

package com.xiang.demo.java.thread.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class TestCyclicBarrier {
	
	public static void main(String[] args) {
		
		int num = 10;
		CyclicBarrier barrier = new CyclicBarrier(num, new Runnable(){

			@Override
			public void run() {
				System.out.println("go on together!");
			}
			
		});
		
		for(int i = 1; i <= num; i++){
			new Thread(new CyclicBarrierWorker(i, barrier)).start();
		}
		
	}
	
}

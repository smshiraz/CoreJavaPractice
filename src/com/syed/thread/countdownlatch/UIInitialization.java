package com.syed.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class UIInitialization implements Runnable {

	CountDownLatch latch;

	UIInitialization(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Initializing UI");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("Done with UI Initialization");
		latch.countDown();
	}

}

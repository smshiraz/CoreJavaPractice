
package com.syed.corejava;

public class OddEvenUsing2Thread implements Runnable {

	private static int count = 1;
	private static final int MAX = 10;
	private static final Object lock = new Object();

	@Override
	public void run() {

		while (count <= MAX) {
			synchronized (lock) {

				// EVEN thread logic
				if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
					System.out.println("Even Thread : " + count);
					count++;
					lock.notify();
				}

				// ODD thread logic
				else if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
					System.out.println("Odd Thread  : " + count);
					count++;
					lock.notify();
				}

				// If it's not this thread's turn, wait
				else {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		OddEvenUsing2Thread task = new OddEvenUsing2Thread();

		Thread oddThread = new Thread(task, "odd");
		Thread evenThread = new Thread(task, "even");

		oddThread.start();
		evenThread.start();
	}

}

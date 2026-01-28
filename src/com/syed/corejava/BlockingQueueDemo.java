package com.syed.corejava;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// Producer class
class Producer implements Runnable {
	private BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Produced: " + i);
				queue.put(i); // blocks if queue is full
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}

// Consumer class
class Consumer implements Runnable {
	private BlockingQueue<Integer> queue;

	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				int item = queue.take(); // blocks if queue is empty
				System.out.println("Consumed: " + item);
				Thread.sleep(1500);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}

// Main class
public class BlockingQueueDemo {
	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

		Thread producerThread = new Thread(new Producer(queue));
		Thread consumerThread = new Thread(new Consumer(queue));

		producerThread.start();
		consumerThread.start();
	}
}

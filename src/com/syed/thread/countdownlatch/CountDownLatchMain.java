package com.syed.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;
//similar to join()
//by using a CountDownLatch we can cause a thread(e.g. main thread) to block until other threads have 
//completed a given task
 
public class CountDownLatchMain {
 
 public static void main(String[] args) {
  try {
   CountDownLatch latch = new CountDownLatch(3);
 
   // Initializing three dependent thread i.e. UI, database and logging
 
   UIInitialization uiInitialization = new UIInitialization(latch);
   Thread uiThread = new Thread(uiInitialization);
 
   DatabaseInitialization dataBaseInitialization = new DatabaseInitialization(latch);
   Thread databaseThread = new Thread(dataBaseInitialization);
 
   LoggingInitialization loggingInitialization = new LoggingInitialization(latch);
   Thread loggingThread = new Thread(loggingInitialization);
 
   uiThread.start();
   databaseThread.start();
   loggingThread.start();
   // Main thread will wait until above threads get completed
   latch.await();
 
   System.out.println("Initialization has been completed, main thread can proceed now");
  } catch (InterruptedException e) {
 
   e.printStackTrace();
  }
 
 }
}
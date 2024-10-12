package com.syed.thread.semaphore;
/* A semaphore controls access to a shared resource through the use of a counter. 
 * If the counter is greater than zero, then access is allowed. If it is zero, then access is denied.
 * 
 * If the semaphore’s count is greater than zero, then the thread acquires a permit,
 *  which causes the semaphore’s count to be decremented.Otherwise, the thread will 
 *  be blocked until a permit can be acquired.
 * When the thread no longer needs an access to the shared resource, it releases the permit, which causes
 *  the semaphore’s count to be incremented.
If there is another thread waiting for a permit, then that thread will acquire a permit at that time.
 */

import java.util.concurrent.*;

//A shared resource/class.
class Shared 
{
 static int count = 0;
}


//Driver class
public class SemaphoreDemo 
{
public static void main(String args[]) throws InterruptedException 
{
   // creating a Semaphore object
   // with number of permits 1
   Semaphore sem = new Semaphore(1);
     
   // creating two threads with name A and B
   // Note that thread A will increment the count
   // and thread B will decrement the count
   MyThread mt1 = new MyThread(sem, "A");
   MyThread mt2 = new MyThread(sem, "B");
     
   // stating threads A and B
   mt1.start();
   mt2.start();
     
   // waiting for threads A and B 
   mt1.join();
   mt2.join();
     
   // count will always remain 0 after
   // both threads will complete their execution
   System.out.println("count: " + Shared.count);
}
}

class MyThread extends Thread
{
 Semaphore sem;
 String threadName;
 public MyThread(Semaphore sem, String threadName) 
 {
     super(threadName);
     this.sem = sem;
     this.threadName = threadName;
 }

 @Override
 public void run() {
       
     // run by thread A
     if(this.getName().equals("A"))
     {
         System.out.println("Starting " + threadName);
         try 
         {
             // First, get a permit.
             System.out.println(threadName + " is waiting for a permit.");
           
             // acquiring the lock
             sem.acquire();
           
             System.out.println(threadName + " gets a permit.");
       
             // Now, accessing the shared resource.
             // other waiting threads will wait, until this 
             // thread release the lock
             for(int i=0; i < 5; i++)
             {
                 Shared.count++;
                 System.out.println(threadName + ": " + Shared.count);
       
                 // Now, allowing a context switch -- if possible.
                 // for thread B to execute
                 Thread.sleep(10);
             }
         } catch (InterruptedException exc) {
                 System.out.println(exc);
             }
       
             // Release the permit.
             System.out.println(threadName + " releases the permit.");
             sem.release();
     }
       
     // run by thread B
     else
     {
         System.out.println("Starting " + threadName);
         try 
         {
             // First, get a permit.
             System.out.println(threadName + " is waiting for a permit.");
           
             // acquiring the lock
             sem.acquire();
           
             System.out.println(threadName + " gets a permit.");
       
             // Now, accessing the shared resource.
             // other waiting threads will wait, until this 
             // thread release the lock
             for(int i=0; i < 5; i++)
             {
                 Shared.count--;
                 System.out.println(threadName + ": " + Shared.count);
       
                 // Now, allowing a context switch -- if possible.
                 // for thread A to execute
                 Thread.sleep(10);
             }
         } catch (InterruptedException exc) {
                 System.out.println(exc);
             }
             // Release the permit.
             System.out.println(threadName + " releases the permit.");
             sem.release();
     }
 }
}


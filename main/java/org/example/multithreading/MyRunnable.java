package org.example.multithreading;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is Running...");
    }

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();       // Create a runnable object
        Thread thread = new Thread(myRunnable);         // Pass the runnable object to a Thread object
        thread.start();     // Start the thread
    }
}

//Explanation:
//The MyRunnable class implements the Runnable interface.
//The run method contains the code that will be executed by the thread.
//In the main method, a MyRunnable object is created, passed to a Thread object, and the start method is called to start the thread.
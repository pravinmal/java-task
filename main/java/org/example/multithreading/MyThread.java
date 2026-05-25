package org.example.multithreading;

public class MyThread extends Thread{

    public void run(){
        System.out.println("Thread is Running...");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();       // Create a thread object
        thread.start();     // Start the thread
    }
}
//Explanation:
//The MyThread class extends the Thread class.
//The run method contains the code that will be executed by the thread.
//In the main method, a MyThread object is created and the start method is called to start the thread.
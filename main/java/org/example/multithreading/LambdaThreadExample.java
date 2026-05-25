package org.example.multithreading;

public class LambdaThreadExample {

    public static void main(String[] args) {
        Runnable task  = () -> System.out.println("Thread is Running...");
        Thread thread = new Thread(task);
        thread.start();
    }
}


//Explanation:
//A lambda expression is used to define the Runnable interface's run method.
//The lambda expression is passed to a Thread object, and the start method is called to start the thread.
//The lambda expression is passed to a Thread object, and the start method is called to start the thread.

//Common Thread Methods
//start()
//Starts the execution of the thread. The run method is called by the Java Virtual Machine (JVM).
//
//run()
//Contains the code to be executed by the thread. This method is called by the thread's start method.
//
//sleep(long millis)
//Pauses the execution of the current thread for the specified number of milliseconds.
//
//join()
//Waits for the thread to die. This method is used to ensure that a thread has completed its execution before the next thread starts.
//
//isAlive()
//Returns true if the thread is still running or not terminated.

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
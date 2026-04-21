package org.example.task.singleton;

public class Main {
    public static void main(String[] args) {

        // Get the Singleton instance
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        // Try getting another instance
        Singleton obj2 = Singleton.getInstance();

        // Check if both references point to same object
        if (obj1 == obj2) {
            System.out.println("Both objects are same (Singleton works!)");
        } else {
            System.out.println("Objects are different (Singleton failed)");
        }
    }
}

package org.example.task.singleton;

class Singleton {

    // Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Static inner helper class
    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

package org.example.task.builder;

class User {

    // Required fields
    private final String name;
    private final int age;

    // Optional fields
    private final String email;
    private final String phone;

    // Private constructor (called by Builder)
    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    // Static Builder class
    public static class Builder {

        // Required fields
        private final String name;
        private final int age;

        // Optional fields
        private String email;
        private String phone;

        // Constructor with required fields
        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Setter methods for optional fields
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        // Build method
        public User build() {
            return new User(this);
        }
    }

    // Method to display object
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}
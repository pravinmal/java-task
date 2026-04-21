package org.example.task.builder;

public class Main {
    public static void main(String[] args) {

        // Creating object using Builder
        User user = new User.Builder("John", 25)
                .setEmail("john@example.com")
                .setPhone("1234567890")
                .build();

        user.display();
    }
    
}


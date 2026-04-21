package org.example.task;

public class Palindrome {

    public static void main(String[] args) {

        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();

        if(str.equals(reversed)){
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }
}

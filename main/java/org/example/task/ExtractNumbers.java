package org.example.task;

public class ExtractNumbers {
    public static void main(String[] args) {

        String str ="ab6h55r100fg";
        String numbers = str.replaceAll("[^0-9]","");
        String character = str.replaceAll("[^a-z]","");
        System.out.println(numbers);
        System.out.println(character);
    }
}






package org.example.java8;

//Example 1: Addition Using Lambda

interface Addition{
    int add(int a, int b);
}
public class Demo {
    public static void main(String[] args) {
        Addition obj = (a, b) -> a + b;
        System.out.println(obj.add(10, 20));
    }
}

package org.example.task;


//Java 8 Program to Find the Maximum Number and Minimum Number in a List

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MaxMinWithStreams {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,8,5,7,6,9,3,5,0,1,2,8,1,10);

        OptionalInt maxNumber = numbers.stream()
                .mapToInt(Integer::intValue)
                .max();

        OptionalInt minNumber = numbers.stream()
                .mapToInt(Integer::intValue)
                .min();

        maxNumber.ifPresent(max -> System.out.println("Maximum Number: " + max));
        minNumber.ifPresent(min -> System.out.println("Minimum Number: " + min));
    }
}

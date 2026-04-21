package org.example.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Pravin", "Asmita", "Ganesh", "Shital", "sonal");

        List<String> sortedNames = names.stream()
//                .sorted()       // Ascending Order
                .sorted(Comparator.reverseOrder())  // Descending Order
                .collect(Collectors.toList());

        System.out.println("Sorted Names:" + sortedNames);
    }
}





package org.example.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 40, 10, 75, 55, 60, 100, 10, 55, 75, 50);

        Optional<Integer> secondHighest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        secondHighest.ifPresent(number -> System.out.println("Second Highest Number:" + number));
    }
}

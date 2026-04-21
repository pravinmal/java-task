package org.example.task;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenList {
    public static void main(String[] args) {


        List<List<Integer>> list = Arrays.asList(

                Arrays.asList(1, 2),
                Arrays.asList(3,4),
                Arrays.asList(5, 6),
                Arrays.asList(7, 8)


        );
        List<Integer> flatList = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(flatList);
    }

}

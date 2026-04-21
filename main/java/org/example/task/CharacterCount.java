package org.example.task;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {

        String str ="Java Programming";
        str.toLowerCase()
                .chars()
                .filter(c -> c != ' ')
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .forEach((ch,count) -> System.out.println(ch + " - " +count));
        System.out.println();

//        Map<Character,Integer> map = new HashMap<>();
//
//        for (char ch : str.toCharArray()){
//            map.put(ch,map.getOrDefault(ch,0)+1);
//        }
//
//       map.forEach((ch,count) -> System.out.println("Character -->> "+ch+ "  count --> "+count));
    }
}

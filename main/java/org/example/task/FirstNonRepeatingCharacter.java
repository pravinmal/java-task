package org.example.task;

import java.util.Optional;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String input = "Pravin Pr Mali";

        Optional<Character> firstNonRepeating = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
                .findFirst();
        firstNonRepeating.ifPresent(c -> System.out.println("First Non-Repeating Character: " + c));
    }
}
 







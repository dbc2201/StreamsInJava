package examples;

import java.util.Arrays;

public class Example5 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        var stream = Arrays.stream(numbers);

        stream.forEach(System.out::println);
    }
}

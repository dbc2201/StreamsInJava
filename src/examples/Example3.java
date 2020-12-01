package examples;

import java.util.stream.IntStream;

public class Example3 {
    public static void main(String[] args) {
        var range = IntStream.range(1, 100);
        range.forEach(number -> System.out.println(number + " "));
    }
}
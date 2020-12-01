package examples;

import java.util.stream.IntStream;

public class Example2 {
    public static void main(String[] args) {
        var range = IntStream.range(1, 100);
        // Method Reference
        // ClassName(.ObjectName[OPTIONAL])::methodName
        // System    .out                  ::print
        range.forEach(System.out::print);
    }
}

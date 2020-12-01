package examples;

import java.util.ArrayList;

public class Example4 {
    public static void main(String[] args) {
        // Data Source
        ArrayList<Integer> list = new ArrayList<>();

        // Let us "stream" it!
        var stream = list.stream(); // Stream<Integer>

        // print the contents of the stream (nothing will be printed since the stream is empty)
        stream.forEach(System.out::println);
    }
}

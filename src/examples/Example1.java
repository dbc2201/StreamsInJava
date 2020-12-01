package examples;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        // An ArrayList of Integer numbers.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(7);
        list.add(18);
        list.add(24);
        list.add(17);
        list.add(5);
        System.out.println("Original List: " + list);

        // Create a "Stream" for the ArrayList.
        Stream<Integer> stream = list.stream();

        // let us find out the smallest element in the list
        var smallestElement = stream.min(Integer::compare);

        // let us print out the smallest element
        if (smallestElement.isPresent()) {
            System.out.println(smallestElement.get());
        }
        // OR we can simplify it like this
        smallestElement.ifPresent(System.out::println);
    }
}

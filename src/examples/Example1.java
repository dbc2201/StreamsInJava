package examples;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        // An ArrayList of Integer numbers.
        ArrayList<Integer> list = new ArrayList<>();
        // adding 10 random numbers to the list
        for (int i = 0; i < 10; i++) {
            // a random number from 1 (inclusive) to 100 (exclusive)
            int randomNumber = (int) ((Math.random() * 100) + 1);
            list.add(randomNumber);
        }
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

        // create another stream for the arraylist
        stream = list.stream();

        // we can find out the largest element in the list also
        var largestElement = stream.max(Integer::compare);

        largestElement.ifPresent(System.out::println);

        // let us sort the list
        Stream<Integer> sortedStream = list.stream().sorted();

        // let us print all the element in this sorted stream
        System.out.println("These are the elements in the sorted stream: ");
        sortedStream.forEach(number -> System.out.print(number + " "));

        // let's say we want to find out all the odd numbers from the arraylist
        // we can do this like

        // 1. Create a stream for the data source
        stream = list.stream();

        // 2. Apply any intermediate functions
        stream = stream.sorted().filter(number -> number % 2 != 0);

        // let us print the numbers now
        System.out.println("\nAll the odd valued elements in the arraylist: ");
        stream.forEach(number -> System.out.print(number + " "));
    }
}

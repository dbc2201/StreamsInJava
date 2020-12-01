Functional Programming in Java (8 or above) using The Stream API
---
_The Stream API_ and _The Lambda Expressions_ are two of the most important features
that have been added to the Java language in a while (2014).  

_The Stream API_ provides methods that can perform 
very sophisticated operations like
- search
- filter
- map  
or otherwise manipulate a set of data (or a large/very large set of data) easily.

_The Stream API_ can also perform tasks "in parallel" thus making the operations
more efficient than the traditional approaches that we have learnt until now.

---
**CAUTION!!!**  
To properly understand the Stream API, you need to be able to 
wrap your head around complicated topics like
1. Generics and Type Erasure in Java
2. Lambda Expressions and Functional Interfaces in Java
3. Parallel Execution of programs
4. The Collections Framework in Java
---

## Stream API in the JDK
_The Stream API_ defines quite some _Interfaces/Classes/Abstract Classes_ in the Java JDK 
which can be observed in the `java.util.stream` package.  
Just navigate to the `java.base` module, and the follow the `java.util.stream` package.

---

## The `BaseStream` Interface  
The `java.util.stream.BaseStream` interface defines the functionality available in all streams.
It is a generic interface which is declared something like this:
```
interface BaseStream<T, S extends BaseStream<T, S>> {
// ...
}
```

---

The very first thing to learn about the Stream API is
that is consists of three basic things
1. A "Data Source" from where the data flows in.
2. One or more intermediate operations. An intermediate operation produces a separate stream to perfom 
the operation, it can also be used to create a "pipeline" to perform
a number of operations on the stream.
3. An optional terminal operation. A terminal operation
"consumes" the stream i.e once a stream is "consumed", it can't be reused.
More about that later...

---

First let us see how we can create a simple Stream in a Java program.

To Create a "Stream" in Java, we can use the 'java.util.stream.Stream' interface.
Since this interface is a Generic Type, we can actually use it to create a stream
of any "reference" type in Java (pre-defined or programmer-defined).

To handle the Stream(s) of primitive type in Java, we have the following interfaces
* IntStream
* DoubleStream
* and LongStream  
all defined in the same 'java.util.stream' package.
---

Let us see an example, we will use the `IntStream` interface's `range()` to create
a range of integers in a stream.

```
import java.util.stream.IntStream;

class Scratch {
    public static void main(String[] args) {
        var range = IntStream.range(1, 10);
        // In the range() method, the first argument is included in the range 
        // but the second number is excluded. 
    }
}
```
Similarily we can create ranges with the `LongStream` interface and the `DoubleStream` interface as well.

---

Let us see how we can print all the numbers in this range now.  
See [here](/src/examples/Example2.java).
It does print the numbers in the range, but the output is a little wacky right?  
No spaces between the numbers makes it look like just one number with a lot of digits!  
Let's fix that!  
 
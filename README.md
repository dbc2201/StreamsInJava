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

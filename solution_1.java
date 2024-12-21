package task5;


import java.util.stream.Stream;

public class solution_1 {
    public static void main(String[] args) {
        // Create a Stream of strings
        Stream<String> s=Stream.of("aBc","d","ef");
        // Convert each string in the stream to uppercase using the map() function
        // Print each element of the mapped stream using forEach()
        s.map(String::toUpperCase).forEach(System.out::println);
    }
}

package task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class solution_2 {
    public static void main(String[] args) {
        // Create a list of strings containing some empty strings and non-empty strings
        List<String> list= Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        // Convert the list to a stream, then apply the filter() method to remove empty strings
        // Collect the filtered elements into a new list
        List<String> nonEmptyStrings= list.stream().filter(s-> !s.isEmpty()).collect(Collectors.toList());
        // Print the list of non-empty strings
        System.out.println(nonEmptyStrings);

    }

}

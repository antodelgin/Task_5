package task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class solution_3 {
    public static void main(String[] args) {
        // Create a list of student names
        List<String> list= Arrays.asList("Anto","Denil","Newlin","Aravind","Abdul","Charles","Arun","Aditi","Carol","Bob");
        // Convert the list to a stream, then Apply the filter() method to keep names starting with 'A'
        // Collect the filtered results into a new list using Collectors.toList()
        List<String> studentsWithA=list.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
        // Print the names of students whose name start with 'A'
        studentsWithA.forEach(name->System.out.println(name));
    }
}

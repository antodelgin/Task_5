package task5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class solution_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); // Create a Scanner object to read user input
        System.out.println("Enter your birthdate (yyyy-mm-dd): ");
        // Parse the input string into a LocalDate object representing the birthdate
        LocalDate birthDate= LocalDate.parse(sc.nextLine()); // Get the current date
        LocalDate currentDate= LocalDate.now();
        Period age=Period.between(birthDate,currentDate); // Calculate period (difference) between birthdate and current date
        // Extract years, months, and days from the calculated period
        int years= age.getYears();
        int months= age.getMonths();
        int days=age.getDays();
        // Print the calculated age in years, months, and days
        System.out.println(years+" years, "+months+" months, "+days+" days.");
    }
}

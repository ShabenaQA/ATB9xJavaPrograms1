package task_22102024;

import java.util.Scanner;

public class task_22102024_t1 {


    public class ReverseNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            int reversedNumber = 0;

            // Use a for loop to reverse the number
            for (; number != 0; number /= 10) {
                int digit = number % 10; // Extract the last digit
                reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            }

            System.out.println("Reversed Number: " + reversedNumber);

            scanner.close(); // Close the scanner
        }
    }

}

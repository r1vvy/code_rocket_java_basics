package lesson3.task26;

import java.util.Scanner;

public class DiamondChars {
    public static void main(String[] args) {
        System.out.print("Input number of terms: ");
        Scanner sc = new Scanner(System.in);
        int termsNumber = sc.nextInt();
        sc.close();

        printPyramid(termsNumber);
    }
    // Could not get the logic that I used before to work, so had to implement one from the internet.
    private static void printPyramid(int rows) {
            // Initialize the count variables
            int count = 1;
            int count2 = 1;
            // Initialize the character variable
            char c = 'A';
            // Outer for loop to iterate for each row
            for (int i = 1; i < (rows * 2); i++) {
                count2 = printSpaces(rows, count2, i);
                printChars(count, c);
                count = setCount(rows, count, i);
                // reset the character to 'A'
                c = 'A';

                System.out.println();
            }
    }

    private static int setCount(int rows, int count, int i) {
        // If the current row is in the top half of the pyramid
        if (i < rows) {
            // Increase the character count
            count += 2;
        } else {
            // Decrease the character count
            count -= 2;
        }
        return count;
    }

    private static void printChars(int count, char c) {
        // Inner for loop to print characters in each row
        for (int j = 0; j < count; j++) {
            System.out.print(c); // Print the current character
            // If the current character is in the left half of the row
            if (j < count / 2) {
                // Increment the character
                c++;
            } else {
                // Decrement the character
                c--;
            }
        }
    }

    private static int printSpaces(int rows, int count2, int i) {
        // Inner for loop to print spaces before each row
        for (int j = rows - count2; j > 0; j--)
        {
            System.out.print(" ");
        }
        // If the current row is in the top half of the pyramid
        if (i < rows) {
            // Increase the space count
            count2++;
        } else {
            // Decrease the space count
            count2--;
        }
        return count2;
    }
}

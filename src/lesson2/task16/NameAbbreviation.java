package lesson2.task16;

import java.util.Scanner;

public class NameAbbreviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String fullName = scanner.nextLine();


        String[] str = fullName.split(" ");

        String resultName = new String();
        for (int i = 0; i < str.length - 1; i++) {
            resultName += str[i].charAt(0) + ".";
        }
        System.out.println(resultName + str[str.length - 1]);
    }
}

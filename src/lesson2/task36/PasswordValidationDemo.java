package lesson2.task36;

import java.util.Scanner;

public class PasswordValidationDemo {
    public static void main(String[] args) {
        PasswordValidationService service = new PasswordValidationService();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password:");
        Password passwordObject = new Password(sc.nextLine());
        sc.close();
        
        if (service.isValid(passwordObject)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }
}

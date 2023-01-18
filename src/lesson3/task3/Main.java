package lesson3.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOne = getNumber();
        int numberTwo = getNumber();
        int numberThree = getNumber();

        System.out.println("The greatest number: " + GreatestNumber(numberOne, numberTwo, numberThree));
    }

    // bad since sc isnt closed.
    private static int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        return sc.nextInt();
    }

    public static int GreatestNumber(int numberOne, int numberTwo, int numberThree) {
        if(numberOne >= numberTwo && numberOne >= numberThree) {
            return numberOne;
        }
        else if(numberTwo >= numberOne && numberTwo >= numberThree) {
            return numberTwo;
        } else {
            return numberThree;
        }
    }
}

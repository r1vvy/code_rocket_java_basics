package lesson2.task8;

import java.util.Scanner;

public class ComplexNumber {
    private double realNumber, imagNumber;
    void setNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of first complex number: ");
        this.realNumber = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        this.imagNumber = sc.nextDouble();
    }

    public double getRealNumber() {
        return realNumber;
    }

    public void setRealNumber(double realNumber) {
        this.realNumber = realNumber;
    }

    public double getImagNumber() {
        return imagNumber;
    }

    public void setImagNumber(double imagNumber) {
        this.imagNumber = imagNumber;
    }
}

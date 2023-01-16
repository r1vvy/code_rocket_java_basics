package lesson2.task8;

public class ComplexDemo {
    public static void main(String[] args) {
        ComplexNumberService complexNumberService = new ComplexNumberService();
        ComplexNumber numberOne = new ComplexNumber();
        ComplexNumber numberTwo = new ComplexNumber();

        System.out.println("Enter 1st complex number:");
        numberOne.setNumbers();
        System.out.println("Enter 2nd complex number:");
        numberTwo.setNumbers();

        ComplexNumber sum = complexNumberService.sum(numberOne, numberTwo);
        complexNumberService.printComplexNumberInformation(sum);

        ComplexNumber diff = complexNumberService.subtract(numberOne, numberTwo);
        complexNumberService.printComplexNumberInformation(diff);

        ComplexNumber product = complexNumberService.product(numberOne, numberTwo);
        complexNumberService.printComplexNumberInformation(product);
    }

}

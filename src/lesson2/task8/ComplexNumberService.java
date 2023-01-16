package lesson2.task8;

public class ComplexNumberService {
    ComplexNumber sum(ComplexNumber numberOne, ComplexNumber numberTwo)
    {
        ComplexNumber tempNumber = new ComplexNumber();

        tempNumber.setRealNumber(numberOne.getRealNumber() + numberTwo.getRealNumber());
        tempNumber.setImagNumber(numberOne.getImagNumber() + numberTwo.getImagNumber());
        return tempNumber;
    }
    ComplexNumber subtract(ComplexNumber numberOne, ComplexNumber numberTwo)
    {
        ComplexNumber tempNumber = new ComplexNumber();

        tempNumber.setRealNumber(numberOne.getRealNumber() - numberTwo.getRealNumber());
        tempNumber.setImagNumber(numberOne.getImagNumber() - numberTwo.getImagNumber());

        return tempNumber;
    }
    ComplexNumber product(ComplexNumber numberOne, ComplexNumber numberTwo)
    {
        ComplexNumber tempNumber = new ComplexNumber();

        tempNumber.setRealNumber(numberOne.getRealNumber() * numberTwo.getRealNumber()
                - numberOne.getImagNumber() * numberTwo.getImagNumber());
        tempNumber.setImagNumber(numberOne.getImagNumber() * numberTwo.getImagNumber()
                + numberOne.getImagNumber() * numberTwo.getRealNumber());

        return tempNumber;
    }
    public void printComplexNumberInformation(ComplexNumber complexNumber) {
        System.out.println(complexNumber.getRealNumber() + " + (" + complexNumber.getImagNumber() + "i)");
    }

}

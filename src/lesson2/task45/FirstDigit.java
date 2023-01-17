package lesson2.task45;

public class FirstDigit {
    public static void main(String[] args) {
        System.out.println(firstDigit(1234));
    }
    public static int firstDigit(int number) {
        int i = 10;
        while (number / i != 0) {
            i *= 10;
        }
        return Math.abs(number / (i / 10));
    }
    
}

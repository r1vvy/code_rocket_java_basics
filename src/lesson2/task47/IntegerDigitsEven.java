package lesson2.task47;

public class IntegerDigitsEven {
    public static void main(String[] args) {
        System.out.println(isIntegerDigitsEven(8642));
    }
    public static boolean isIntegerDigitsEven(int number) {
        int i = 10;
        while (number / i != 0) {
            if (Math.abs(number % i) % 2 != 0) {
                return false;
            }
            i *= 10;
        }
        return true;
    }
}

package lesson2.task43;

public class ConsecutiveIntegers {
    public static void main(String[] args) {
        System.out.println(isConsecutiveThree(15, 16, 17));
        
    }
    public static boolean isConsecutiveThree(int numberOne, int numberTwo, int numberThree) {
        if (numberOne + 1 == numberTwo && numberTwo + 1 == numberThree || numberOne - 1 == numberTwo && numberTwo - 1 == numberThree) {
            return true;
        } 
        return false;
    }
}

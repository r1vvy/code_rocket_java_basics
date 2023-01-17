package lesson2.task44;

public class Main {
    public static void main(String[] args) {
        System.out.println(isMiddlePoint(2, 4, 6));
        
    }
    public static boolean isMiddlePoint(int numberOne, int numberTwo, int numberThree) {  
        if (numberOne + numberThree == numberTwo * 2 || numberOne + numberTwo == numberThree * 2 || numberTwo + numberThree == numberOne * 2) {
            return true;
        }
        return false;
    }
}

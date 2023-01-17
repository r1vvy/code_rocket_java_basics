package lesson2.task37;

public class MatrixDisplay {
    public static void main(String[] args) {
        displayMatrix(10);
    }
    
    public static void displayMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
    
}

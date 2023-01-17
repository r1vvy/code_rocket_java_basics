package lesson2.task11;

public class MatrixDemo {
    public static void main(String[] args) {
        int[][] elementsMatrixOne = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] elementsMatrixTwo = {{1,1,1},{2,2,2},{3,3,3}};
        Matrix<Integer> matrixOne = new Matrix<Integer>(3, 3, elementsMatrixOne);
        Matrix<Integer> matrixTwo = new Matrix<Integer>(3, 3, elementsMatrixTwo);

        Matrix<Integer> additionResultMatrix = matrixOne.add(matrixTwo);
        additionResultMatrix.printInfo();

        Matrix<Integer> multiplicationResultMatrix = matrixOne.multiply(matrixTwo);
        multiplicationResultMatrix.printInfo();
    }
}

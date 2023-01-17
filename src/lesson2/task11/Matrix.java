package lesson2.task11;

/*
Create a class called 'Matrix' containing constructor that
initializes the number of rows and number of columns of a new
Matrix object. The Matrix class has the following information: 
1 - number of rows of matrix 
2 - number of columns of matrix 
3 - elements of matrix in the form of 2D array
The Matrix class has methods for each of the following: 
1 - get the number of rows 
2 - get the number of columns 
3 - set the elements of the matrix at given position (i,j) 
4 - adding two matrices. If the matrices are not addable, "Matrices
cannot be added" will be displayed. 
5 - multiplying the two matrices
 */
public class Matrix<Integer> {
    private int rows;
    private int cols;
    private int[][] elements;

    public Matrix(int rows, int cols, int[][] elements) {
        this.rows = rows;
        this.cols = cols;
        this.elements = elements;
    }

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public int[][] getElements() {
        return elements;
    }

    public void setElement(int row, int column, int element) {
        this.elements[row][column] = element;
    }
    public Matrix<Integer> add(Matrix<Integer> other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Cannot add matrices with different dimensions");
        }
        int[][] resultElements;
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                this.elements[i][j] += other.elements[i][j];
            }
        }
        return new Matrix<Integer>(this.rows, this.cols, this.elements);
    }
    public Matrix<Integer> multiply(Matrix<Integer> other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Invalid matrix dimensions for multiplication");
        }
        int[][] resultElements = new int[this.rows][this.cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                int sum = 0;
                for (int k = 0; k < this.cols; k++) {
                    sum += this.elements[i][k] * other.elements[k][j];
                }
                resultElements[i][j] = sum;
            }
        }
        return new Matrix<Integer>(this.rows, this.cols, resultElements);
    }

    public void printInfo() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(this.elements[i][j] + " ");
            }
            System.out.println();
        }
    }
}

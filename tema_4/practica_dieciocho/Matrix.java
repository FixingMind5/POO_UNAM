package practica_dieciocho;

public class Matrix {
    private double [][] matrix;
    private int rows, columns;

    public Matrix(int rows, int columns) {
        if (rows > 0 && columns > 0) {
            this.rows = rows;
            this.columns = columns;
            this.matrix = new double [this.rows][this.columns];
        }
    }

    public void assign(double [][] matrix) {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.matrix[i][j] = matrix[i][j];
            }
        }
    }

    public void show() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.println(
                    "[" + ( i + 1 ) + "]" +
                    "[" + (j + 1) + "]" + 
                    ": " + this.matrix[i][j]
                );
            }
        }
        System.out.println("\n");
    }

    public Matrix add(Matrix matrix) {
        Matrix resultMatrix = new Matrix(this.rows, this.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                resultMatrix.matrix[i][j] = this.matrix[i][j] + matrix.matrix[i][j];
            }
        }

        return resultMatrix;
    }
}

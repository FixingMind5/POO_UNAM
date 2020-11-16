package practica_diecisiete;

public class Vector {
    private double [] vector;
    private int dimention;
    public Vector(int dimention) {
        this.dimention = dimention;
        vector = new double[this.dimention];
    }

    public void assing(double vector[]) {
        for (int i = 0; i < vector.length; i++) {
            this.vector[i] = vector[i];
        }
    }

    public void show() {
        for (int i = 0; i < this.dimention; i++) {
            System.out.println((i + 1) + ": " + this.vector[i]);
        }
        System.out.println();
    }

    public Vector add(Vector vector)  {
        Vector result = new Vector(this.dimention);
        for (int i = 0; i < this.vector.length; i++) {
            result.vector[i] = this.vector[i] + vector.vector[i];
        }

        return result;
    }

    public double dotProduct(Vector vector) {
        double result = 0.0;
        for (int i = 0; i < this.dimention; i++) {
            result += this.vector[i] * vector.vector[i];
        }

        return result;
    }
}

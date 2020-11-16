/**
 * Objetivo: Elaborar un programa que nos permita sumar dos matrices.
 */

package practica_dieciocho;

public class TestMatrix {
    public static void main(String[] args) {
        System.out.println("Programa que suma dos matrices");
        System.out.println("Construyendo matriz A");
        Matrix A = new Matrix(2, 3);
        double [][] firstMatrix = {
            { 0.0, 1.0, 2.0 },
            { 3.0, 4.0, 5.0 }
        };
        A.assign(firstMatrix);
        System.out.println("Los elementos de la matriz A son");
        A.show();
        System.out.println("Construyendo la matriz B");
        Matrix B = new Matrix(2, 3);
        double [][] secondMatrix = {
            { 0.0, 1.0, 2.0 },
            { 3.0, 4.0, 5.0 }
        };
        B.assign(secondMatrix);
        System.out.println("Los elementos de la matriz B son");
        B.show();
        System.out.println("Sumando las matrices A y B");
        Matrix additionMatrix = A.add(B);
        System.out.println("Matrices sumadas");
        additionMatrix.show();
    }
}

/**
 * Conclusión: Aprendimos que conociendo las bases
 * sumar dos matrices puede ser un proceso sencillo;
 */
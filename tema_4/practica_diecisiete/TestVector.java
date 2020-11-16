/**
 * Objetivo: Elaborar un programa que nos permita operar
 * con dos objetos del tipo vector.
 */

package practica_diecisiete;

public class TestVector {
    public static void main(String[] args) {
        Vector firstVector = new Vector(5);
        Vector secondVector = firstVector;
        double [] firstArray = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        firstVector.assing(firstArray);
        Vector vectorAdded = firstVector.add(secondVector);
        System.out.println("================");
        System.out.println("Vectores sumados");
        System.out.println("================");
        vectorAdded.show();
        double dotProductResult = firstVector.dotProduct(secondVector);
        System.out.println("================");
        System.out.println("Producto punto de ambos vectores: " + dotProductResult);
        System.out.println("================");
    }
}

/**
 * Conclusión: Aprendimos a interactuar con dos objetos, a hacer
 * que modifiquen sus pripiedades entre sí.
 */
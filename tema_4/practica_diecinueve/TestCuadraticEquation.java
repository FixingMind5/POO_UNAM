/**
 * Elaborar un programa orientado a objetos que nos permita
 * encontrar las raíces cuadradas de una ecuación de 
 * segundo grado en una variable.
 */

package practica_diecinueve;
import java.util.Scanner;

public class TestCuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el valor de A...");
        double a = scanner.nextDouble();
        System.out.println("Introduzca el valor de B...");
        double b = scanner.nextDouble();
        System.out.println("Introduzca el valor de C...");
        double c = scanner.nextDouble();
        CuadraticEquation chicharronera = new CuadraticEquation(a, b, c);
        chicharronera.solve();
        chicharronera.show();

        scanner.close();
    }
}

/**
 * Conclusión: Aprendimos que automatizar un proceso como este es
 * crucial para ahorrar tiempo en ciertos cálculos.
 */
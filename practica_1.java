import java.util.Scanner;
import javax.naming.OperationNotSupportedException;

class HolaMundo {
    public static void main(String[] args) throws Exception {
        double a, b, c, determinante, x1, x2;
        System.out.println("Bienvendio al programa, Introduce los valores a leer\n");
        Scanner in = new Scanner(System.in);
        System.out.println("Inserta el valor de a, coeficiente del factor cuadrático:");
        a = in.nextDouble();
        System.out.println("\n");
        if (a == 0) {
            throw new IllegalArgumentException("el valor de \"a\" no puede ser cero: ");
        }
        System.out.println("Inserta el valor de b, coeficiente del factor lineal:");
        b = in.nextDouble();
        System.out.println("\n");
        System.out.println("Inserta el valor de c, coeficiente del valor sin variable:");
        c = in.nextDouble();
        System.out.println("\n");

        determinante = Math.pow(b, 2) - (4 * a * c);

        if (determinante < 0) {
            throw new OperationNotSupportedException("la ecuación no tiene raices reales");
        }

        x1 = ((-1 * b) + Math.sqrt(determinante)) / (2 * a);
        x2 = ((-1 * b) - Math.sqrt(determinante)) / (2 * a);

        System.out.println("Las raíces son");
        System.out.println("Para x1: " + x1);
        System.out.println("Para x2: " + x2);
    }
}
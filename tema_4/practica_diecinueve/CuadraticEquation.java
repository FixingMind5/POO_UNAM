package practica_diecinueve;

public class CuadraticEquation {
    private double a, b, c, firstRoot, secondRoot;

    public CuadraticEquation(double a, double b, double c) {
        this.a = a; this.b = b; this.c = c;
    }

    public void solve() throws ArithmeticException {
        double discriminant = Math.pow(this.b, 2.0) - (4.0 * this.a * this.c);
        if (a == 0) throw new ArithmeticException("A no puede ser 0, (division by 0 error)");
        if (discriminant < 0) throw new ArithmeticException("La ecuacion no tiene raices");
        this.firstRoot = ((-1 * b) + Math.sqrt(discriminant)) / 2 * a;
        this.secondRoot = ((-1 * b) - Math.sqrt(discriminant)) / 2 * a;
    }

    public void show() {
        System.out.println("Resultados");
        System.out.println("Primer raiz: " + this.firstRoot);
        System.out.println("Segunda raiz: " + this.secondRoot);
    }
}

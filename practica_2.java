public class OpsCC {
    public static void main(String[] args) {
        // inicializamos los valores del numerador y denominador
        int n = 10, d = 2;
        // 'and' de cortocicuito
        if (d != 0 && (n % d) == 0) {
            System.out.println(d + " es un factor de " + n);
        }
        d = 0; // cambia el valor del denominador a cero
        if (d != 0 && (n % d) == 0) {// No se evalua 2o el operando
            System.out.println(d + " es un factor de " + n);
        }
    }
}
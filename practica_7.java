public class practica_7 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println();
            System.out.println();
            System.exit(0);
        }
        float a, b;
        try {
            a = Float.parseFloat(args[0]);
            b = Float.parseFloat(args[1]);
        } catch (NumberFormatException nfe2) {
            a = 0.0f;
            b = 0.0f;
        }

        float c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }
}


class OpsCad {
    public static void main(String[] args) {
        // decalaracion de variables
        String cad1 = "Java es el lenguaje # 1";
        String cad2 = new String(cad1);
        String cad3 = "Java es el lenguaje # 2";
        // Calcula la longitud de una cadena
        System.out.print("La longitud de cad1 es ");
        System.out.println(cad1.length());

        // despleiga cadena caracter por caracter
        for (int i = 0; i < cad1.length(); i++) {
            System.out.print(cad1.charAt(i));

        }
        System.out.println();
        // compara dos cadenas
        if (cad1.equals(cad2) == true) {
            System.out.println("cad1 es igual que cad2!");
        } else {
            System.out.println("cad1 no es igual que cad2!");
        }
        int result = cad1.compareTo(cad3);
        if (result == 0) {
            System.out.println("cad1 es igual que cad3!");
        } else if (result < 0) {
            System.out.println("cad1 es mayor que cad3");
        } else {
            System.out.println("cad1 es mayor que cad3!");
        }
    }
}
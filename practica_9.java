import java.util.Scanner;

public class practica_9 {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Eliga una opcion: ");
        System.out.println("1. opcion 1");
        System.out.println("2. opcion 2");
        System.out.println("3. opcion 3");
        System.out.println("4. Salir del programa");
        do {
            System.out.println("Elija su opcion");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Opcion 1");
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    break;
                case 4:
                    System.out.println("Fin del programa");
                    break;
            
                default:
                    System.out.println("Opcion invalida intente de nuevo");
                    break;
            }
        } while( opcion != 4);
    }
}

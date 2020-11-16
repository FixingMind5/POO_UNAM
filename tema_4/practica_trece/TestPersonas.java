/**
 * Objetivo:
 * Elaborar un programa que nos permita implementar un arreglo
 * del tipo persona ''Persona''.
 * - El programa debe utilizar el concepto de ''arreglo de objetos''.
 */
package practica_trece;

import java.util.Scanner;

public class TestPersonas {
    public static void main(String[] args) {
        Person [] persons = new Person[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < persons.length; i++) persons[i] = new Person();
        System.out.println("Comencemos a llenar los datos de las personas");
        for (int i = 0; i  < persons.length; i++) {
            System.out.println("=============================");
            System.out.println("Registrando datos para la persona " + (i + 1));
            System.out.println("=============================");
            System.out.println("Ingrese el nombre de la persona: ");
            persons[i].setName(scanner.nextLine());
            System.out.println("Ingrese la edad de la persona: ");
            String age = scanner.nextLine();
            persons[i].setAge(Integer.parseInt(age));
        }
        System.out.println("Fin del registro de personas!");

        System.out.println("=============================");
        System.out.println("Estas son las personas registradas en el sistema");
        System.out.println("=============================");
        for (int i = 0; i < persons.length; i++) {
            System.out.println((i + 1) + ": " + persons[i].getName() + " " + persons[i].getAge() + " anios");
        }

        scanner.close();
        System.out.println("Fin");
    }
}

/**
 * Conclusión: Pudimos crear un arreglo del tipo persona satisfactoriamente en una línea de código
 * aprendimos a poblarlo y acceder a  cada uno de sus elementos.
 */
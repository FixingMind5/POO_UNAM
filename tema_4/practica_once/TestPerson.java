/**
 * Elaborar un programa que nos permita implementar objetos del
 * tipo "persona".
 * - El programa debe utilizar el concepto "Encapsulamiento de datos"
 */

package practica_once;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Manuel");
        person.setAge(19);
        System.out.println("Nombre: " + person.getName());
        System.out.println("Edad: " + person.getAge());
    }
}

/**
 * Conclusión: Aprendimos a realizar encapsulamiento de datos para
 * proteger las propiedades de nuestras clases
 */
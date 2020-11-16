/**
 * Elaborar un programa con una función que reciba
 * un objeto como parámetro y modifique sus propiedades.
 */

package practica_catorce;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        asignaPersona(person);
        System.out.println("Nombre: " + person.getName());
        System.out.println("Edad: " + person.getAge());
    }

    public static void asignaPersona(Person person) {
        person.setName("Manuel Aguilar");
        person.setAge(19);
    }
}

/**
 * Conclusión: es maravilloso el paso por referencia de java, sin duda
 * facilita mucha sintaxis de C/C++;
 */
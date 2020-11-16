/**
 * Crear un prrgrama que regrese un objeto.
 * El objeto tiene que instanciarse dentro de
 * la función.
 */

package practica_quince;

public class TestPerson {
    public static void main(String[] args) {
        Person person = assignPerson();
        System.out.println("Nombre: " + person.getName());
        System.out.println("Edad: " + person.getAge());
    }

    public static Person assignPerson() {
        Person person = new Person();
        person.setName("Manuel");
        person.setAge(19);

        return person;
    }
}

/**
 * Conclusión: Sin duda java fue un gameChanger de 
 * programación funcional a Orientada Objetos.
 */
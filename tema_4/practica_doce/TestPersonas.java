/**
 * Objetivo:
 * Elaborar un programa que nos permita instanciar objetos del tipo persona
 * El programa debe utilizar el concepto de "Sobrecarga de constructores"
 */

package practica_doce;

public class TestPersonas {
    public static void main(String[] args) {
        Person manuel = new Person();
        manuel.setName("Manuel");
        manuel.setAge(19);
        System.out.println("Nombre: " + manuel.getName());
        System.out.println("Edad: " + manuel.getAge());
        Person ricardo = new Person("Ricardo", 16);
        System.out.println("Nombre: " + ricardo.getName());
        System.out.println("Edad: " + ricardo.getAge());
    }
}

/**
 * Conclusión: Aprendimos a instanciar objetos y a sobrecargar sus constructores
 * con la finalidad de inicializar objetos con diferentes propiedades según
 * lo necesitemos.
 */
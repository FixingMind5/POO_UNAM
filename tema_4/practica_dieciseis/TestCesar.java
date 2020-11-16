package practica_dieciseis;

/**
 * Objetivo: Desarrollar el algoritmo de encriptación de Cesar.
 */

public class TestCesar {
    public static void main(String[] args) {
        String firstString = new String("Hola mundo!");
        String secondString = new String();
        firstString = Cesar.encrypt(firstString, 5);
        System.out.println(firstString);
        secondString = Cesar.encrypt(secondString, 5);
        System.out.println(secondString);
    }
}

/**
 * Conclusión: Aprendimos a programar un algoritmo bastante
 * bueno;
 */
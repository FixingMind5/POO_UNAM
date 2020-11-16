package practica_veinte;

public class TestStringList {
    public static void main(String[] args) {
        StringList stringList = new StringList();

        stringList.appendNew("Anita");
        stringList.appendNew("Beto");
        stringList.appendNew("Carlos");
        stringList.appendNew("Daniel");
        stringList.appendNew("Ericka");
        
        System.out.println("Contenido de la lista");
        stringList.show();
    }
}

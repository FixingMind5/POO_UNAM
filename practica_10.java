import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.io.InputStreamReader;

public class practica_10 {
    public static void main(String[] args) {
        List <String>list = new ArrayList<>();
        FileInputStream aent = null;
        try {
            aent = new FileInputStream("./alumnos.txt");
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
            return;
        }
        String cad = new String();
        BufferedReader b = new BufferedReader(new InputStreamReader((aent)));
        String [] arr = null;
        try {
            do {
                cad = b.readLine();
                if (cad != null) list.add(cad);
            } while(cad != null);
            aent.close();
            System.out.println("\n\n====================");
            System.out.println("Arreglo en desorden");
            System.out.println("====================\n\n");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            Collections.sort(list, new StringComparator());
            System.out.println("\n\n====================");
            System.out.println("Arreglo Ordenado");
            System.out.println("====================\n\n");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            return;
        }
    }
}

class StringComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
}

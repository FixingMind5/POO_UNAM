package practica_veinte;

public class Cell {
    String item = null;
    Cell next = null;
    Cell () {};
    Cell (String string, Cell cell) {
        this.item = string;
        this.next = cell;
    }
}

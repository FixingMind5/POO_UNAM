package practica_veinte;

public class StringList {
    private Cell head = null;
    public StringList() {
        this.head = new Cell("*", head);
    }

    public Cell first() {
        return this.head;
    }

    public Cell last() {
        Cell last = this.head;
        while (last != null && last.next != null) {
            last = last.next;
        }

        return last;
    }

    public void appendNew(String string, Cell cell) {
        cell.next = new Cell(string, cell.next);
    }

    public void appendNew(String string) {
        this.appendNew(string, this.last());
    }

    public void show() {
        Cell cell = this.head;
        while (cell != null) {
            System.out.println(cell.item);
            cell = cell.next;
        }
    }
}

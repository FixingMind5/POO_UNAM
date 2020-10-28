//Factorial.java
class Factorial {
    public static void main(String[] args) {
        int n = 0;
        while (n <= 10) {
            System.out.println(n + "! = " + factorial(n++));
        }
    }

    public static int factorial(int n) {
        int f = 1;
        while (n > 1) {
            f *= n; // taquigrafia
            n--;
        }
        return f;
    }

}
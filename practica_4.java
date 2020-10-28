//BitLogic.java
class BitLogic {
    public static void main(String[] args) {
        int a = 2, b = 7; // datos de entrada
        int c = a & b;
        int d = a | b;
        int e = a ^ b;
        int f = a & 0x0f;
        System.out.printf("a = %s\n", valorBinario(a));
        System.out.printf("b = %s\n", valorBinario(b));
        System.out.printf("a&b = %s\n", valorBinario(c));
        System.out.printf("a|b = %s\n", valorBinario(d));
        System.out.printf("a^b = %s\n", valorBinario(e));
        System.out.printf("~a = %s\n", valorBinario(f));
    }

    public static String valorBinario(int n) {
        String[] arr = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111", };
        if (n >= 0 && n <= 15)
            return arr[n];
        return null;
    }
}
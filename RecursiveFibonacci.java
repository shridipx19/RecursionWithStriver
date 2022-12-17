public class RecursiveFibonacci {
    static int fFibonacci(int n) {
        // base condition
        if (n <= 1) {
            return n;
        }
        int last = fFibonacci(n -1);
        int slast = fFibonacci(n -2);
        return last + slast;
    }

    public static void main(String[] args) {
        System.out.println(fFibonacci(10));
    }
}

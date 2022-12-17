public class BasicRecursionProblems {
    //recursive function to print name 5 times
    static void printName(int n, String name) {
        if (n == 0)
            return;
        System.out.println(name);
        printName(n -1, name);
    }
    static void print1ToN(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);
        print1ToN(i+ 1, n);
    }
    static void printNto1(int i, int n) {
        if (i < n)
            return;
        System.out.println(i);
        printNto1(i -1, n);
    }
    private static void withoutUsingPlus1ToN(int i, int n) {
        if (i < n)
            return;
        // print while backtracking
        withoutUsingPlus1ToN(i -1, n);
        System.out.println(i);
    }
    private static void withoutUsingMinusNTo1(int i, int n) {
        if (i > n)
            return;
        // print while backtracking
        withoutUsingMinusNTo1(i +1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
//        // Q1. Print your name 5 times
//        String name = "Shridip";
//        printName(5, name);
//        // Q2. Print 1-> N
//        print1ToN(1, 4);
//        // Q2. Print N-> 1
//        printNto1(4, 1);
//        // Q3. Print 1-> N without using +
//        withoutUsingPlus1ToN(4,1);
        // Q5. Print N-> 1 without using -
        withoutUsingMinusNTo1(1,4);


    }


}

public class ParameterisedVsFunctionalRecursion {
    // parameterised -> carried in the arguments
    static void parameterisedSum(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        parameterisedSum(n -1, sum + n);
    }
    // functional -> returns something
    static int functionalSum(int n) {
        if (n == 0)
            return 0;
        return n + functionalSum(n -1); // will wait 3 + something()
    }
    private static void parameterisedFact(int n, int fact) {
        if (n == 1) {
            System.out.println(fact);
            return;
        }
        parameterisedFact(n -1, fact * n);
    }
    private static int functionalFact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * functionalFact(n -1);
    }
    public static void main(String[] args) {
        // Q1. Calc sum of first N number
//        parameterisedSum(4, 0);
//        System.out.println(functionalSum(1000));
        // Q2. Calc factorial of a number
        // parameterised
        parameterisedFact(4, 1);
        System.out.println(functionalFact(4));


    }


}

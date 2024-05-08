public class FibonacciRecursion {
    public static void main (String args []) {
        //Print the Fibonacci Sequence Using Recursion
        // (Given a number, n, print the first nth element of the Fibonacci sequence.
        // If n = 5, print the fifth Fibonacci number.)

        int n = 9;
        System.out.println(fib(n));
    }
        static int fib(int n) {
        if (n<= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
}

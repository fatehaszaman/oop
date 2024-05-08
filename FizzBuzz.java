public class FizzBuzz {
    public static void main(String args[]) {

        // Write a function that prints out the numbers 1 to 100.
        // If the number is divisible by 3, print “Fizz” instead of the number
        // if it’s divisible by 5, print “Buzz” instead of the number.
        // (If the number is divisible by 3 and 5, print “FizzBuzz”)

        int n = 100; //n= total #  i= each #

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0)
                System.out.print("Frizzbuzz" + " ");

            else if (i % 5 == 0)
                System.out.print("Buzz" + " ");
            else if (i % 3 == 0)
                System.out.print("Fizz" + " ");
            else
                System.out.print(i + " ");

        }
    }
}
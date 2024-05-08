public class CountNumber {
    public static void main(String [] args) {

        // Count a certain letter in a word

    int n= 1023330;
    String s= String.valueOf(n);
    int count = 0;
        for (int i=0; i< s.length(); i++) {
        if (s.charAt(i)=='3') //Adding a ; will count all the numbers
            count++;      // Not adding a ; in the line above will only count the “x”’s in the word

    }
                System.out.println(count);
}
}

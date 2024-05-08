public class CountLetter {
    public static void main(String [] args) {

        // Count a certain letter in a word

        String s = "Mississippi";
        int count = 0;
        for (int i=0; i< s.length(); i++) {
            if (s.charAt(i)=='i') //Adding a ; will count the letters in the entire word
                    count++;      // Not adding a ; in the line above will only count the “i”’s in the word

        }
                System.out.println(count);
        }
    }


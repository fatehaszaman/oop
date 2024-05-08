public class Palindrome {
    static boolean sentencePal(String str){
        int l = 0;
        int h = str.length() - 1;

        // Convert to lowercase
        str = str.toLowerCase();

        while(l <= h) {
            char getAtL = str.charAt(l);
            char getAtH = str.charAt(h);

            // Skip non-alphabetic characters
            if (!Character.isLetter(getAtL)) {
                l++;
            } else if (!Character.isLetter(getAtH)) {
                h--;
            } else if (getAtL == getAtH) {
                l++;
                h--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args){
        String str = "Race car.";
        if (sentencePal(str))
            System.out.println("Sentence is palindrome");
        else
            System.out.println("Sentence is not a palindrome");
    }
}

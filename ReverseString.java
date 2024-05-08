public class ReverseString {
        public static void main(String [] args) {

           // Reverse a String
            String s = "Mississippi";
            char [] resultarray= s.toCharArray();
            for (int i = resultarray.length-1; i>=0; i--){
                System.out.print(resultarray[i]);
            }
        }
}



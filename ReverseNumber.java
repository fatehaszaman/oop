public class ReverseNumber {
    public static void main(String [] args) {

        //Reverse a Number
        int n= 100;
        String s= String.valueOf(n); //int to string

        char [] resultarray= s.toCharArray();
        for(int i = resultarray.length -1; i>=0; i--){
            System.out.print(resultarray[i]);
        }
    }
    }

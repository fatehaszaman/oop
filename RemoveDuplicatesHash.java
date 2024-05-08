import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesHash {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 6, 4};

        // Convert array to HashSet to remove duplicates
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        // Convert HashSet back to array
        int[] newArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            newArray[index++] = num;
        }

        // Print the array without duplicates
        System.out.println("Array with duplicates removed:");
        System.out.println(Arrays.toString(newArray));
    }
}

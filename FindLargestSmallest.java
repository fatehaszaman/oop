public class FindLargestSmallest {
    public static void main(String[] args) {
        int[] array = {3, 7, 2, 8, 5};

        // Initialize the largest and smallest numbers with the first element
        int largest = array[0];
        int smallest = array[0];

        // Iterate through the array to find the largest and smallest numbers
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Print the largest and smallest numbers
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}

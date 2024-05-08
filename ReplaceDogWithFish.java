public class ReplaceDogWithFish {
    public static String replaceDogWithFish(String input) {
        // Replace all occurrences of "dog" with "fish"
        String replacedString = input.replaceAll("dog", "fish");
        return replacedString;
    }

    public static void main(String[] args) {
        String input = "I have a dog and my dog loves to play with other dogs.";
        String replacedString = replaceDogWithFish(input);
        System.out.println(replacedString);
    }
}

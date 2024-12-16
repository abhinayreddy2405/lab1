public class palindrome {
    public static void main(String[] args) {
        // Hardcoded input: "level"
        String input = "level";
       
        // Normalize the input string by converting it to lowercase (if you want case insensitivity)
        String normalizedString = input.toLowerCase();
       
        // Reverse the normalized string
        String reversedString = new StringBuilder(normalizedString).reverse().toString();
       
        // Check if the normalized string is equal to its reversed version
        if (normalizedString.equals(reversedString)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}


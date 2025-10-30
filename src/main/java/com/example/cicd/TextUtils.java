package com.example.cicd;

public class TextUtils {

    private TextUtils() {
        // Prevent instantiation
    }

    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }

    /**
     * Safely parses a string into an integer.
     * Returns 0 if the string cannot be parsed.
     */
    public static int safeParseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            // Intentionally ignore invalid input
            // Returning 0 as default value
        }
        return 0;
    }
}

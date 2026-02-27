
import java.util.Scanner;

        public class PalindromeCheckApp {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Input text: ");
                String input = scanner.nextLine();

                // Remove spaces and convert to lowercase
                String cleaned = input.replaceAll("\\s+", "").toLowerCase();

                // Reverse the string
                String reversed = new StringBuilder(cleaned).reverse().toString();

                // Check if palindrome
                boolean isPalindrome = cleaned.equals(reversed);

                System.out.println("Is it a Palindrome? : " + isPalindrome);

                scanner.close();
            }
        }

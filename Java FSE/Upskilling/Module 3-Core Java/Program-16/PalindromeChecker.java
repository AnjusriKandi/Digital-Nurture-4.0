import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String og = sc.nextLine();
        String c = og.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev = new StringBuilder(c).reverse().toString();
        if (c.equals(rev))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");
    }
}

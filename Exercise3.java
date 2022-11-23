import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        /*
         * The following program should:
         *    - read a word from the terminal, that the user types in
         *    - print "Valid", if the given word starts with an "a" or "A" and has more than 5 letters
         *    - print "Not valid" otherwise
         *
         * The program currently does not work as expected, e.g. although "Apfelbaum" is a valid string, it prints "Not valid".
         * Fix it.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word:");
        String word = scanner.next();

        if (!isValid(word)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
    }

    public static boolean isValid(String str) {
        return str.toLowerCase().startsWith("a") && str.length() > 5;
    }
}

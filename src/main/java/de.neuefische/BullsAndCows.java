package de.neuefische;

import java.util.Scanner;

/*
 * ------------------------------------------------------------------------------
 * BULLS AND COWS (aka Mastermind)
 * ------------------------------------------------------------------------------
 * The user must guess a 4-digit secret code.
 * If the matching digits are in their right positions, they are "bulls", if in different positions, they are "cows".
 *
 * Example:
 *      secret code: 4271
 *      users guess: 1234
 *      Result: 1 bull and 2 cows. (The bull is "2", the cows are "4" and "1")
 * ------------------------------------------------------------------------------
 *
 * Tasks:
 *      [x] set a secret code
 *      [x] let the user enter a guess
 *      [x] compare the guess with the secret code (rules see above)
 *      [x] output the result in the format "%d bull(s) and %d cow(s)."
 *      [x] if the user guessed the secret code correct:
 *          - output "You found the secret code. Congratulations!"
 *          - the game then stops
 *      [x] if the user does not guess the secret code:
 *          - ask for the next guess
 *
 * ------------------------------------------------------------------------------
 *
 * Bonus:
 *      [ ] randomly generate the secret code (consists of 4 digits from 0-9, the digits must be all different)
 *      [ ] implement a maximum number of turns the user has to guess the secret code
 *      [ ] validate the user input (the rules are the same as for the secret code generation)
 */
public class BullsAndCows {

    private static final String SUCCESS_MSG = "You found the secret code. Congratulations!";
    private static final String RESULT_MSG_PATTERN = "%d bull(s) and %d cow(s).";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String secretCode = "4271";
        System.out.println("The secret code is generated: ****");

        String result;
        do {
            System.out.print("Please enter your guess: ");
            String guess = scanner.nextLine();

            result = compare(secretCode, guess);

            System.out.println(result);
            System.out.println();

        } while (!SUCCESS_MSG.equals(result));
    }

    public static String compare(String secretCode, String guess) {
        if (secretCode.equals(guess)) {
            return SUCCESS_MSG;
        }

        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < secretCode.length(); i++) {
            char digitInSecretCode = secretCode.charAt(i);
            char digitInGuess = guess.charAt(i);

            if (digitInSecretCode == digitInGuess) {
                bulls++;
            } else if (secretCode.contains(String.valueOf(digitInGuess))) {
                cows++;
            }
        }

        return String.format(RESULT_MSG_PATTERN, bulls, cows);
    }

}

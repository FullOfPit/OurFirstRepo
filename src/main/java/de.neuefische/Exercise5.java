package de.neuefische;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        /*

                                -- Brace yourselves, this is a tough nut to crack --


        Write a program that:
            - [x] takes a word from the user through the console
            - [x] decides which data type the input resembles
            - [x] will print the respective data type and the corresponding input in the following format:
                 "Your input <input> is suggested to be a <data type>"
            - [x] asks the user to decide whether the suggested data type is correct; confirm is so, deny if not
            - [ ] if the suggested data type is correct:
                calls a separate method that will return the input in its respective suggested data type
            - [ ] if the suggested data type is incorrect:
                tests whether the input can be converted into the data type the user suggests or not
                - [ ] if so: calls a separate method that will return the input in the respective data type the user suggested
                - [ ] if not: tells the user that the data types cannot be converted (easily)
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input a value:");
        String inputValue = scanner.nextLine();

        String type = detectDataType(inputValue);

        System.out.printf("Your input '%s' is suggested to be a %s.\n", inputValue, type);

        boolean suggestionIsCorrect = askWhetherSuggestionIsCorrect(scanner);


    }

    private static boolean askWhetherSuggestionIsCorrect(Scanner scanner) {
        System.out.println("Is this correct? [y/n]");
        String input = scanner.nextLine();

        return "y".equals(input);
    }

    public static String detectDataType(String value) {
        if (isDouble(value)) {
            return Double.class.getSimpleName();
        }

        if (isInteger(value)) {
            return Integer.class.getSimpleName();
        }

        if (isBoolean(value)) {
            return Boolean.class.getSimpleName();
        }

        return String.class.getSimpleName();
    }

    public static boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    public static boolean isDouble(String value) {
        try {
            Double.valueOf(value);
        } catch (NumberFormatException e) {
            return false;
        }

        return !isInteger(value);
    }

    public static boolean isBoolean(String value) {
        value = value.toLowerCase();

        return "true".equals(value) || "false".equals(value);
    }
}

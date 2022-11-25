package de.neuefische;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Exercise 2");

        /*
         * Write a program that prints the following to the console
         *  a) the first character of the string, e.g. if the string is "hello", it prints "h"
         *  b) the last letter of a string, e.g. if the string is "hello", it prints "o"
         *  c) the first character in UPPERCASE, e.g. if the string is "hello", it prints "H"
         */

        String toCheck = "Feierabendbier";
        // System.out.println(toCheck.charAt(0));
        System.out.println(findFirstCharacter(toCheck));
        System.out.println(findLastCharacter(toCheck));
    }
    //the first character of the string, e.g. if the string is "hello", it prints "h"
    public static char findFirstCharacter(String one) {

        return one.charAt(0);
    }


    // the last letter of a string, e.g. if the string is "hello", it prints "o"
    public static char findLastCharacter(String one) {
        int numberOfLetters = one.length();
        return one.charAt(numberOfLetters -1);
    }

}

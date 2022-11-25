package de.neuefische;

public class Main {
    public static void main(String[] args) {
        System.out.println("Glück Auf aus dem Erzgebirge!");

        /*
        declare and initialise a string firstName
        declare and initialise a string lastName

        declare a method that will take two strings, a first name and a last name
                and prints the full name to the console

        declare a method that will take two strings, a first name and a last name
                and returns the full name
         */
    String firstName = "Doreen";
    String lastName = "Mier";

        System.out.println(fullName1(firstName, lastName));

        fullName2(firstName, lastName);

    }

    public static String fullName1(String eins, String zwei){

        return (eins + " " + zwei);
    }

    public static void fullName2(String eins, String zwei){

        System.out.println(fullName1(eins, zwei));
    }
}

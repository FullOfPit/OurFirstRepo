public class Exercise3 {
    public static void main(String[] args) {
        /**
         * The following program should print
         *    Alvin Chipmunk (12)
         *
         * but it currently prints
         *    ChipmunkAlvin (12)
         *
         * Fix it.
         */

        String firstName = "Alvin";
        String lastName = "Chipmunk";

        String info = getInfo(firstName, lastName, 12);

        System.out.println(info);
    }

    public static String getInfo(String firstName, String lastName, int age) {
        return getFullname(lastName, firstName) + " (" + age + ")";
    }

    public static String getFullname(String firstName, String lastName) {
        return firstName + lastName;
    }
}

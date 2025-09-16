//Various input strings are given as names of people and it has to be verified that those
// names do not start with digits and if they do they should not be considered.

public class Prog32 {
    public static void main(String[] args) {
        String[] Names = { "1Alicia", "Mark", "3suzy", "Penelope" };
        for (String pos : Names) {
            if (Character.isDigit(pos.charAt(0))) {
                System.out.println(pos + ":" + "The username is Invalid.");
            } else {
                System.out.println(pos + ":" + "The username is valid.");
            }

        }

    }
}
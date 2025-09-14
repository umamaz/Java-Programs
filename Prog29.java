import java.util.HashMap;
import java.util.Scanner;

public class Prog29 {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- Dictionary Menu ---");
            System.out.println("1. Add Word");
            System.out.println("2. Search Word");
            System.out.println("3. Display All Words");
            System.out.println("4. Delete Word");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter word: ");
                    String word = sc.nextLine();
                    System.out.print("Enter meaning: ");
                    String meaning = sc.nextLine();
                    dictionary.put(word, meaning);
                    System.out.println("Word added successfully!");
                    break;

                case 2:
                    System.out.print("Enter word to search: ");
                    String search = sc.nextLine();
                    if (dictionary.containsKey(search)) {
                        System.out.println(search + " : " + dictionary.get(search));
                    } else {
                        System.out.println("Word not found in dictionary.");
                    }
                    break;

                case 3:
                    if (dictionary.isEmpty()) {
                        System.out.println("Dictionary is empty.");
                    } else {
                        System.out.println("\n--- All Words in Dictionary ---");
                        for (String key : dictionary.keySet()) {
                            System.out.println(key + " : " + dictionary.get(key));
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter word to delete: ");
                    String delete = sc.nextLine();
                    if (dictionary.remove(delete) != null) {
                        System.out.println("Word deleted successfully!");
                    } else {
                        System.out.println("Word not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}


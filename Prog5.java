import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.Get the input from the user 
         System.out.println("Enter your paragraph:");
          String paragraph = sc.nextLine();

        //2.Enter the word you want to replace 
        System.out.println("old Word");
        String oldword = sc.nextLine();

        //3.Enter the new word
        System.out.println("New Word");
        String newWord = sc.nextLine();

        //Replace Word
        String updatedParagraph = paragraph.replace(oldword,newWord);

        // Step 5: Show result
        System.out.println("\nUpdated paragraph:");
        System.out.println(updatedParagraph);

        sc.close();
    }
}



        
        
    

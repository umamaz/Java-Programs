import java.util.Scanner;
//Pascals Triangle
public class Prog28 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for number of rows
        System.out.print("Enter number of rows for Pascal's Triangle: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 0; i < n; i++) {
            
            // Print spaces for alignment
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }

            // Compute and print values
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);  // Formula for next value
            }
            
            System.out.println();  // New line for next row
        }

        sc.close();
    }
}

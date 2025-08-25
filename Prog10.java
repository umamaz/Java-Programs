import java.util.Scanner;

public class Prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int originalNum = num;
        int result = 0;
        int n = String.valueOf(num).length(); // count digits

        // Calculate sum of digits raised to power n
        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, n);
            num /= 10;
        }

        // Check Armstrong condition
        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }
    }
}

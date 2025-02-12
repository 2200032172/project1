import java.util.Scanner;

public class Armstrong {
    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, digits = 0;

        // Count the number of digits
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        // Compute the sum of digits raised to the power of digits
        temp = num;
        while (temp > 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = 100; // Default limit for Jenkins builds

        System.out.print("Enter the limit: ");
        if (scanner.hasNextInt()) { 
            limit = scanner.nextInt();
        } else {
            System.out.println("No valid input received. Using default limit: " + limit);
        }

        scanner.close();

        System.out.println("Armstrong numbers up to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

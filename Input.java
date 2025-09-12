import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to check: ");
        int num1 = sc.nextInt();

        if (num1 > 0) {
            System.out.println("The number is positive.");
        } else if (num1 < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
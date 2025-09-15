
import java.util.Scanner;

public class ArrUpdate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: ");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        int choice = -1;
        while (choice != 0) {
            System.out.println("Enter the Task you want to perform: 1. Updation   0. Exit0");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter the index you want to update: ");
                int ind = sc.nextInt();
                System.out.println("Enter the value: ");
                int val = sc.nextInt();

                arr[ind] = val;

                System.out.println("new array: ");
                for (int i = 0; i < a; i++) {
                    System.out.print(arr[i] + " ");
                }

            } else if (choice == 0) {
                System.out.println("Exiting..");
            }
        }

    }
}

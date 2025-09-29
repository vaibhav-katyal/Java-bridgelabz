
import java.util.Scanner;

public class quicksort {

    static void qs(int arr[], int low, int high) {
        if (low <= high) {
            int pi = partition(arr, low, high);

            qs(arr, low, pi - 1);
            qs(arr, pi + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int temp = low-1;
        for (int i = low; i < high ; i++) {
            if (arr[i] <= arr[high]) {
                temp++;

                int c = arr[temp];
                arr[temp] = arr[i];
                arr[i] = c;
            }
        }

        int c = arr[temp+1];
        arr[temp+1] = arr[high];
        arr[high] = c; 

        return temp + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        qs(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

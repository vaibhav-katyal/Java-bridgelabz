
import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2,3,4,5,67,7};

        int sum1 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }

        System.out.println(sum1);
    }
}
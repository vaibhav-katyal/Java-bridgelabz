
import java.util.Scanner;

public class factorial_iter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = 1;

        while(n > 0){
            ans *= n;
            n--;
        }

        System.out.println("Factorial: " + ans);
    }
}
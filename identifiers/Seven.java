
import java.util.Scanner;

public class Seven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double ans = (a>b) ? a : b;

        System.out.println("Greater: " + ans);
    }
}

import java.util.Scanner;

public class Three{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("a>b: " + (a>b));
        System.out.println("a<b: " + (a<b));
        System.out.println("a>=b: " + (a>=b));
        System.out.println("a<=b: " + (a<=b));
        System.out.println("a==b: " + (a==b));
        System.out.println("a!=b: " + (a!=b));
    }
}
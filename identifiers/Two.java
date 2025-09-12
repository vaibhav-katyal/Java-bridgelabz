
import java.util.Scanner;

public class Two{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        System.out.println("Before operations: " + a);
        a++;

        System.out.println("After ++: " + a);

        a--;
        System.out.println("After --: " + a);
    }
}
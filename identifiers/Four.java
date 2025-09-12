
import java.util.Scanner;

public class Four{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();

        System.out.println("Value Before: " + a);

        a+= 5;
        System.out.println("Value after a+=: " + a);

        a-= 2;
        System.out.println("Value after a-=: " + a);

        a*=2;
        System.out.println("Value after a*=: " + a);
    }
}
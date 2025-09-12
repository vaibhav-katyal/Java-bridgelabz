
import java.util.Scanner;

public class Eight{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        float marks = sc.nextFloat();

        System.out.println(name + " has scored " + marks + " marks.");
    }
}
import java.util.Scanner;

public class med_six{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int result = (a) ^ (1 << 3);

        System.out.println(result);
    }
}

import java.util.Scanner;

public class fibo_iter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements you want to print: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        if(n == 1){
            System.out.println(a);
        }
        else if(n == 2){
            System.out.print(a + " ");
            System.out.println(b);
        }
        else{
            System.out.print(a + " ");
            System.out.print(b + " ");

            while(n-2 != 0){
                int c = a+b;
                System.out.print(c + " ");

                a = b;
                b = c;

                n--;
            }
        }

    }
}

import java.util.Scanner;

public class Pascal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int k=0; k<n-i; k++){
                System.out.print(" ");
            }

            int num = 1;
            for(int j=0; j<=i; j++){
                System.out.print(num + " ");

                num = num*(i-j)/(j+1);

            }

            System.out.println("");
        }
        
    }
}
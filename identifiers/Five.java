
import java.util.Scanner;

public class Five{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a>0 && a%2 == 0){
            System.out.println("Positive and Even");
        }else{
            System.out.println("No");
        }
    }
}
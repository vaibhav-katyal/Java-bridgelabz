
import java.util.Scanner;

public class med_five{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        String ans = (num>0) ? "Positive":(num<0) ? "Negative":"Zero";

        System.out.println(ans);
    }
}

import java.util.Scanner;

public class str_prac{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        
        StringBuffer sb = new StringBuffer(str).reverse();


        if(str.equals(sb.toString())){
            System.out.println("Palindrome");
        }else{
            System.out.println("No");
        }
    }
}

import java.util.Scanner;

// Multiplication table

public class Two{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a<=0){
            System.out.println("Invalid input!");
        }else{
            for(int i=1; i<=10; i++){
                System.out.println(a +"*" +i+"= "+a*i);
            }
        }
    }
}
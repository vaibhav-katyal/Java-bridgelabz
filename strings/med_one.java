
import java.util.Scanner;

public class med_one{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char [] str1 = str.toCharArray();

        for(int i=0; i<str1.length; i++){
            if(str1[i] == 'a' || str1[i] == 'e' || str1[i] == 'i' || str1[i] == 'o' || str1[i] == 'u'){
                str1[i] = '*';
            }
        }

        System.out.println(str);
        System.out.println(str1);

    }
}
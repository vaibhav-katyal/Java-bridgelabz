
import java.util.Scanner;

public class str_prac2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String [] arr = str.split(" ");

        arr[1] = new StringBuffer(arr[1]).reverse().toString();

        String result = String.join(" ", arr);

        System.out.println(result);

    }
}
import java.util.Scanner;

public class One{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        float a = obj.nextFloat();
        float b = obj.nextFloat();

        System.out.println("Addition: " + (a+b));
        System.out.println("Substraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));
        System.out.println("Modulus: " + (a%b));
    }
}
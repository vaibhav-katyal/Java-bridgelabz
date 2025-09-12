


public class Typecasting{
    public static void main(String[] args) {
        int var = 9;
        double myVar = var;          // automatically converts (Widening)

        System.out.println(var);
        System.out.println(myVar);

        // int newVar = myVar;           // cant do this
        int newVar = (int)myVar;
        System.out.println(newVar);

     
    }
}
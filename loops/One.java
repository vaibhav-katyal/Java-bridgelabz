// Print all odd numbers between 1 and 30 using a for loop and if statement.

public class One{
    public static void main(String[] args) {
        for(int i=1; i<30; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}

import java.util.ArrayList;


public class list{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Adding

        names.add("Vaibhav");
        names.add("op");

        // Display
        System.out.println("Names: "+ names);

        // individual

        System.out.println("First Name: " + names.get(1));

        // remove

        names.remove("lol");         // if not present no error
        names.remove("op");        
        System.out.println(names);

        names.add("manu");
        names.add("madhav");

        for(String name:names){
            System.out.println(name);
        }

        names.remove(1);
        System.out.println("Names: "+ names);
    }
}
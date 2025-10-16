class Dog{
    String name;
    int age;

    Dog(String n, int a){
        name = n;
        age = a;
    }

    void getDetails(){
        System.out.println("Name: " + name + " Age: " + age);
    }
}

public class easy_two{
    public static void main(String[] args) {
        Dog d1 = new Dog("Jatin", 18);
        Dog d2 = new Dog("Garg", 19);
        
        d1.getDetails();
        d2.getDetails();
    }
}